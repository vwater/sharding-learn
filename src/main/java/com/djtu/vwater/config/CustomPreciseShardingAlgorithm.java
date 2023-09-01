package com.djtu.vwater.config;


import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

/**
 * @author vwater
 */

@Service
public class CustomPreciseShardingAlgorithm implements PreciseShardingAlgorithm<LocalDateTime> {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMM");

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<LocalDateTime> shardingValue) {
        String tableName = shardingValue.getLogicTableName();
        LocalDateTime createTime = shardingValue.getValue();
        String yearMonth = createTime.format(formatter);
        return tableName + "_" + yearMonth;
    }
}
