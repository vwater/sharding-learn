package com.djtu.vwater.config;

import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;
import java.util.List;
import java.util.Properties;

/**
 * @author vwater
 */
public class DataSourceShardingComplexAlgorithm implements ComplexKeysShardingAlgorithm {
    private  Properties properties = new Properties();


    @Override
    public Collection<String> doSharding(Collection collection, ComplexKeysShardingValue complexKeysShardingValue) {
        Integer shard = 2023;
        if (shard <= 2023) {
            return List.of("archive_order_2023");
        } else {
            return List.of("archive_order_2024");
        }
    }

    @Override
    public Properties getProps() {
        return properties;
    }

    @Override
    public void init(Properties properties) {
        this.properties=properties;
    }
}
