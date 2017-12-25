package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.MdTaizhen;
import org.pojo.MdTaizhenExample;

public interface MdTaizhenMapper {
    int countByExample(MdTaizhenExample example);

    int deleteByExample(MdTaizhenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MdTaizhen record);

    int insertSelective(MdTaizhen record);

    List<MdTaizhen> selectByExample(MdTaizhenExample example);

    MdTaizhen selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MdTaizhen record, @Param("example") MdTaizhenExample example);

    int updateByExample(@Param("record") MdTaizhen record, @Param("example") MdTaizhenExample example);

    int updateByPrimaryKeySelective(MdTaizhen record);

    int updateByPrimaryKey(MdTaizhen record);
}