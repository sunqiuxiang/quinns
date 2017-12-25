package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.TLogs;
import org.pojo.TLogsExample;

public interface TLogsMapper {
    int countByExample(TLogsExample example);

    int deleteByExample(TLogsExample example);

    int insert(TLogs record);

    int insertSelective(TLogs record);

    List<TLogs> selectByExample(TLogsExample example);

    int updateByExampleSelective(@Param("record") TLogs record, @Param("example") TLogsExample example);

    int updateByExample(@Param("record") TLogs record, @Param("example") TLogsExample example);
}