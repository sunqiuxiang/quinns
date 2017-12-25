package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.TTask;
import org.pojo.TTaskExample;

public interface TTaskMapper {
    int countByExample(TTaskExample example);

    int deleteByExample(TTaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TTask record);

    int insertSelective(TTask record);

    List<TTask> selectByExample(TTaskExample example);

    TTask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TTask record, @Param("example") TTaskExample example);

    int updateByExample(@Param("record") TTask record, @Param("example") TTaskExample example);

    int updateByPrimaryKeySelective(TTask record);

    int updateByPrimaryKey(TTask record);
    
    int updates(Integer taskId);
}