package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.TLog;
import org.pojo.TLogExample;

public interface TLogMapper {
    int countByExample(TLogExample example);

    int deleteByExample(TLogExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(TLog record);

    int insertSelective(TLog record);
    
    List<TLog> dist();

    List<TLog> selectByExample(TLogExample example);

    TLog selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") TLog record, @Param("example") TLogExample example);

    int updateByExample(@Param("record") TLog record, @Param("example") TLogExample example);

    int updateByPrimaryKeySelective(TLog record);

    int updateByPrimaryKey(TLog record);
}