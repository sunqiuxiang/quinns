package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.MdMonitor;
import org.pojo.MdMonitorExample;

public interface MdMonitorMapper {
    int countByExample(MdMonitorExample example);

    int deleteByExample(MdMonitorExample example);

    int insert(MdMonitor record);

    int insertSelective(MdMonitor record);

    List<MdMonitor> selectByExample(MdMonitorExample example);

    int updateByExampleSelective(@Param("record") MdMonitor record, @Param("example") MdMonitorExample example);

    int updateByExample(@Param("record") MdMonitor record, @Param("example") MdMonitorExample example);
}