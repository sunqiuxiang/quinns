package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.TTaskCheck;
import org.pojo.TTaskCheckExample;

public interface TTaskCheckMapper {
    int countByExample(TTaskCheckExample example);

    int deleteByExample(TTaskCheckExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TTaskCheck record);

    int insertSelective(TTaskCheck record);

    List<TTaskCheck> selectByExample(TTaskCheckExample example);

    TTaskCheck selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TTaskCheck record, @Param("example") TTaskCheckExample example);

    int updateByExample(@Param("record") TTaskCheck record, @Param("example") TTaskCheckExample example);

    int updateByPrimaryKeySelective(TTaskCheck record);

    int updateByPrimaryKey(TTaskCheck record);
}