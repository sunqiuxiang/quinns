package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.DzjConstant;
import org.pojo.DzjConstantExample;

public interface DzjConstantMapper {
    int countByExample(DzjConstantExample example);

    int deleteByExample(DzjConstantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DzjConstant record);

    int insertSelective(DzjConstant record);

    List<DzjConstant> selectByExample(DzjConstantExample example);

    DzjConstant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DzjConstant record, @Param("example") DzjConstantExample example);

    int updateByExample(@Param("record") DzjConstant record, @Param("example") DzjConstantExample example);

    int updateByPrimaryKeySelective(DzjConstant record);

    int updateByPrimaryKey(DzjConstant record);
}