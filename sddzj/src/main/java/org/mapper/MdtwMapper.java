package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.Mdtw;
import org.pojo.MdtwExample;

public interface MdtwMapper {
    int countByExample(MdtwExample example);

    int deleteByExample(MdtwExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(Mdtw record);

    int insertSelective(Mdtw record);

    List<Mdtw> selectByExample(MdtwExample example);

    Mdtw selectByPrimaryKey(String uuid);
    
    List<Mdtw> chaxuntaiwang();
    
    List<Mdtw> chaxunxiazai(Mdtw Mdtw);
    
    List<Mdtw> chaxunxiazai1(Mdtw Mdtw);

    int updateByExampleSelective(@Param("record") Mdtw record, @Param("example") MdtwExample example);

    int updateByExample(@Param("record") Mdtw record, @Param("example") MdtwExample example);

    int updateByPrimaryKeySelective(Mdtw record);

    int updateByPrimaryKey(Mdtw record);
}