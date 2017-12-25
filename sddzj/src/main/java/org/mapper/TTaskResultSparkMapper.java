package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.TTaskResultSpark;
import org.pojo.TTaskResultSparkExample;

public interface TTaskResultSparkMapper {
    int countByExample(TTaskResultSparkExample example);

    int deleteByExample(TTaskResultSparkExample example);

    int insert(TTaskResultSpark record);

    int insertSelective(TTaskResultSpark record);

    List<TTaskResultSpark> selectByExample(TTaskResultSparkExample example);

    int updateByExampleSelective(@Param("record") TTaskResultSpark record, @Param("example") TTaskResultSparkExample example);

    int updateByExample(@Param("record") TTaskResultSpark record, @Param("example") TTaskResultSparkExample example);
}