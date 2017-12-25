package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.DzjUser;
import org.pojo.DzjUserExample;

public interface DzjUserMapper {
    int countByExample(DzjUserExample example);

    int deleteByExample(DzjUserExample example);

    int insert(DzjUser record);

    int insertSelective(DzjUser record);
    
    int updates(DzjUser record);

    List<DzjUser> selectByExample(DzjUserExample example);

    int updateByExampleSelective(@Param("record") DzjUser record, @Param("example") DzjUserExample example);

    int updateByExample(@Param("record") DzjUser record, @Param("example") DzjUserExample example);
}