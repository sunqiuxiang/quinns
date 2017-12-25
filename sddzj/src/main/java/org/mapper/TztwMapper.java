package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.Tztw;
import org.pojo.TztwExample;

public interface TztwMapper {
    int countByExample(TztwExample example);

    int deleteByExample(TztwExample example);

    int insert(Tztw record);

    int insertSelective(Tztw record);

    List<Tztw> selectByExample(TztwExample example);

    int updateByExampleSelective(@Param("record") Tztw record, @Param("example") TztwExample example);

    int updateByExample(@Param("record") Tztw record, @Param("example") TztwExample example);
}