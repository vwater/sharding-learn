package com.djtu.vwater.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.core.plugins.InterceptorIgnoreHelper;
import com.baomidou.mybatisplus.core.toolkit.PluginUtils;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.handler.TenantLineHandler;
import com.baomidou.mybatisplus.extension.plugins.inner.TenantLineInnerInterceptor;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.NullValue;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wang, yong
 * @Date 2021-10-29 15:38
 */
@Configuration
@Slf4j
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        //此处编写需要进行tenantId隔离的表名称，后期可以放在yml里
        List<String> tenantTables = new ArrayList<>();
        tenantTables.add("order_header");
        tenantTables.add("order_item");


        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new TenantLineInnerInterceptor(new TenantLineHandler() {
            @Override
            public Expression getTenantId() {
                Integer tenantId = TenantContextHolder.getTenantId();
                log.debug("当前租户为{}", tenantId);
                if (tenantId == null) {
                    return new NullValue();
                }
                return new LongValue(tenantId);
            }

            // 这是 default 方法,默认返回 false 表示所有表都需要拼多租户条件
            @Override
            public boolean ignoreTable(String tableName) {
                return !tenantTables.contains(tableName.replace("`",""));
            }
        }) {
            @Override
            public void beforeQuery(Executor executor, MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) throws SQLException {
                if (InterceptorIgnoreHelper.willIgnoreTenantLine(ms.getId())) return;
                PluginUtils.MPBoundSql mpBs = PluginUtils.mpBoundSql(boundSql);
                //对Hint语法做兼容，不会优化掉select语句前的/**/注释
                String commentPrefix = "";
                if (mpBs.sql().startsWith("/*") && mpBs.sql().contains("*/")) {
                    commentPrefix = mpBs.sql().substring(0, mpBs.sql().indexOf("*/") + 2) + " ";
                }
                mpBs.sql(commentPrefix + parserSingle(mpBs.sql(), null));
            }
        });
        // 如果用了分页插件注意先 add TenantLineInnerInterceptor 再 add PaginationInnerInterceptor
        // 用了分页插件必须设置 MybatisConfiguration#useDeprecatedExecutor = false
        interceptor.addInnerInterceptor(new CustomPaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }


    /**
     * 审计字段自动填充
     *
     * @return {@link MetaObjectHandler}
     */
    @Bean
    public MybatisPlusMetaObjectHandler mybatisPlusMetaObjectHandler() {
        return new MybatisPlusMetaObjectHandler();
    }
}
