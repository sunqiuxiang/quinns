package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.MdTasktable;
import org.pojo.MdTasktableExample;

public interface MdTasktableMapper {
    int countByExample(MdTasktableExample example);

    int deleteByExample(MdTasktableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MdTasktable record);

    int insertSelective(MdTasktable record);

    List<MdTasktable> selectByExample(MdTasktableExample example);
    
    List<MdTasktable> shenhexiazaitz(String taizhen);
    
    List<MdTasktable> shenhexiazai1(MdTasktable record);
    
    List<MdTasktable> finduuid1(MdTasktable record);

    MdTasktable selectByPrimaryKey(Integer id);
    
    List<MdTasktable> xiazailishi(MdTasktable record);
    
    List<MdTasktable> xiazailishi1(MdTasktable record);
    
    int xiazaidead();

    int updateByExampleSelective(@Param("record") MdTasktable record, @Param("example") MdTasktableExample example);

    int updateByExample(@Param("record") MdTasktable record, @Param("example") MdTasktableExample example);

    int updateByPrimaryKeySelective(MdTasktable record);
    
    int shenpixiazai(MdTasktable record);
    
    int downloads(MdTasktable record);

    int update22(MdTasktable record);

    int updateByPrimaryKey(MdTasktable record);
}