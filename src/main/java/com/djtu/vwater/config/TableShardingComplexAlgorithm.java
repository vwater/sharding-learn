package com.djtu.vwater.config;

import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class TableShardingComplexAlgorithm implements ComplexKeysShardingAlgorithm {
    private Properties properties = new Properties();


    @Override
    public Collection<String> doSharding(Collection collection, ComplexKeysShardingValue complexKeysShardingValue) {
        String logicTableName = complexKeysShardingValue.getLogicTableName();
        Integer tenantId = 100;
        return Set.of(logicTableName + "_" + tenantId % 100);
    }

    @Override
    public Properties getProps() {
        return properties;
    }

    @Override
    public void init(Properties properties) {

    }
}
