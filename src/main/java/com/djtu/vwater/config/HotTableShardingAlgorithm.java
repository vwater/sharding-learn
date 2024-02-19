package com.djtu.vwater.config;

import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;

import java.util.Collection;
import java.util.Properties;

/**
 * @author vwater
 */
public class HotTableShardingAlgorithm implements StandardShardingAlgorithm<Integer> {

    /**
     * 分片算法的属性配置
     */
    private final Properties properties = new Properties();

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
        Integer tenantId = preciseShardingValue.getValue();
        return preciseShardingValue.getLogicTableName() + "_" + tenantId % 100;
    }

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Integer> rangeShardingValue) {
        return null;
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
    }
}
