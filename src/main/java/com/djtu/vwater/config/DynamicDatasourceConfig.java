package com.djtu.vwater.config;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.provider.AbstractDataSourceProvider;
import com.baomidou.dynamic.datasource.provider.DynamicDataSourceProvider;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DynamicDataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * shardingDataSource作为一个动态数据源注入
 *
 * @author shaolb
 */
@Configuration
public class DynamicDatasourceConfig {
    @Resource
    private DynamicDataSourceProperties properties;
    //
//    @Lazy
    @Autowired
    private DataSource  shardingSphereDataSource;


    @Bean
    DynamicDataSourceProvider archiveDynamicDataSourceProvider() {
        return new AbstractDataSourceProvider() {
            @Override
            public Map<String, DataSource> loadDataSources() {
                return new HashMap<>() {
                    {
                        put("sharding", shardingSphereDataSource);
                    }
                };
            }
        };
    }

    /**
     * 由于存在shardingDataSource 和 这个dataSource，必须指定一个优先级，否则mybatis-plus无法自动装配
     *
     * @return
     */
    @Bean
    @Primary
    public DataSource dataSource() {
        DynamicRoutingDataSource dataSource = new DynamicRoutingDataSource();
        dataSource.setPrimary(properties.getPrimary());
        dataSource.setStrict(properties.getStrict());
        dataSource.setStrategy(properties.getStrategy());
        dataSource.setP6spy(properties.getP6spy());
        dataSource.setSeata(properties.getSeata());
        return dataSource;
    }
}
