package com.djtu.vwater.config;



import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;
import org.apache.shardingsphere.sharding.spi.ShardingAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Properties;

public class DataSourceShardingAlgorithm implements StandardShardingAlgorithm<String> {
    private  Properties properties = new Properties();


    @Override
    public String doSharding(Collection collection, PreciseShardingValue preciseShardingValue) {
        Integer shard=2023;
        if (shard<=2023){
            return "archive_order_2023";
        }else {
            return "archive_order_2024";
        }

    }

    @Override
    public Collection<String> doSharding(Collection collection, RangeShardingValue rangeShardingValue) {
        return null;
    }

    /**
     * 获取分片算法的类型
     *
     * @return 分片算法的类型
     */
    @Override
    public String getType() {
        return "CLASS_BASED";
    }

    /**
     * 获取分片算法的属性配置
     *
     * @return 分片算法的属性配置
     */
    @Override
    public Properties getProps() {
        return properties;
    }

    /**
     * 初始化分片算法和属性配置
     *
     * @param properties 分片算法的属性配置
     */
    @Override
    public void init(Properties properties) {
//        this.properties.putAll(properties);;
    }
}
