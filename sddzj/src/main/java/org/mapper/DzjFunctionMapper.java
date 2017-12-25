package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.DzjFunction;
import org.pojo.DzjFunctionExample;

public interface DzjFunctionMapper {
    int countByExample(DzjFunctionExample example);

    int deleteByExample(DzjFunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DzjFunction record);

    int insertSelective(DzjFunction record);

    List<DzjFunction> selectByExample(DzjFunctionExample example);

    DzjFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DzjFunction record, @Param("example") DzjFunctionExample example);

    int updateByExample(@Param("record") DzjFunction record, @Param("example") DzjFunctionExample example);

    int updateByPrimaryKeySelective(DzjFunction record);
    
    int updatepower(DzjFunction record);

    int updateByPrimaryKey(DzjFunction record);
}