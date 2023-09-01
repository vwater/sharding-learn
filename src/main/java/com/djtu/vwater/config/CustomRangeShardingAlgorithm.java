package com.djtu.vwater.config;

import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author vwater
 */
@Service
public class CustomRangeShardingAlgorithm implements RangeShardingAlgorithm<LocalDateTime> {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMM");

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<LocalDateTime> shardingValue) {
        Collection<String> result = new LinkedHashSet<>();
        LocalDateTime lowerBound = shardingValue.getValueRange().lowerEndpoint();
        LocalDateTime upperBound = shardingValue.getValueRange().upperEndpoint();

        String lowerTable = getTableName(shardingValue.getLogicTableName(),lowerBound);
        String upperTable = getTableName(shardingValue.getLogicTableName(),upperBound);

        if (lowerTable.equals(upperTable)) {
            result.add(lowerTable);
        } else {
            result.addAll(availableTargetNames);
        }
        return result;
    }

    private String getTableName(String prefixTableName,LocalDateTime dateTime) {
        return prefixTableName + dateTime.format(FORMATTER);
    }

}