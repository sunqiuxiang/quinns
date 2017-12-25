package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.MdFilepath;
import org.pojo.MdFilepathExample;

public interface MdFilepathMapper {
    int countByExample(MdFilepathExample example);

    int deleteByExample(MdFilepathExample example);

    int insert(MdFilepath record);

    int insertSelective(MdFilepath record);

    List<MdFilepath> selectByExample(MdFilepathExample example);

    int updateByExampleSelective(@Param("record") MdFilepath record, @Param("example") MdFilepathExample example);

    int updateByExample(@Param("record") MdFilepath record, @Param("example") MdFilepathExample example);
}