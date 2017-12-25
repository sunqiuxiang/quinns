package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.DzjUserCheck;
import org.pojo.DzjUserCheckExample;

public interface DzjUserCheckMapper {
    int countByExample(DzjUserCheckExample example);

    int deleteByExample(DzjUserCheckExample example);

    int deleteByPrimaryKey(Integer checkid);

    int insert(DzjUserCheck record);

    int insertSelective(DzjUserCheck record);

    List<DzjUserCheck> selectByExample(DzjUserCheckExample example);

    DzjUserCheck selectByPrimaryKey(Integer checkid);

    int updateByExampleSelective(@Param("record") DzjUserCheck record, @Param("example") DzjUserCheckExample example);

    int updateByExample(@Param("record") DzjUserCheck record, @Param("example") DzjUserCheckExample example);

    int updateByPrimaryKeySelective(DzjUserCheck record);

    int updateByPrimaryKey(DzjUserCheck record);
}