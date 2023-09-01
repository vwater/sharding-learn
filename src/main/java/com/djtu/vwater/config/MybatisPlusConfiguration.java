package com.djtu.vwater.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author vwater
 */
@Configuration
public class MybatisPlusConfiguration {

    /**
     * 插件注册
     * @return MybatisPlus拦截器
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        // 分页插件
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

    /**
     * 分页设置
     * @return  分页拦截器
     */
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor() {
        PaginationInnerInterceptor innerInterceptor = new PaginationInnerInterceptor();
        // 单页分页条数限制
        innerInterceptor.setMaxLimit(100L);
        // 数据库类型
        innerInterceptor.setDbType(DbType.MYSQL);
        // 当超过最大页数时不会报错
        innerInterceptor.setOverflow(true);
        return innerInterceptor;
    }
}