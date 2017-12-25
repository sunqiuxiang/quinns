package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.Mdtz;
import org.pojo.MdtzExample;

public interface MdtzMapper {
    int countByExample(MdtzExample example);

    int deleteByExample(MdtzExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(Mdtz record);

    int insertSelective(Mdtz record);

    List<Mdtz> selectByExample(MdtzExample example);

    Mdtz selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") Mdtz record, @Param("example") MdtzExample example);

    int updateByExample(@Param("record") Mdtz record, @Param("example") MdtzExample example);

    int updateByPrimaryKeySelective(Mdtz record);

    int updateByPrimaryKey(Mdtz record);
}