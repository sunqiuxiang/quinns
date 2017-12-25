package org.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.pojo.TNotice;
import org.pojo.TNoticeExample;

public interface TNoticeMapper {
    int countByExample(TNoticeExample example);

    int deleteByExample(TNoticeExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(TNotice record);

    int insertSelective(TNotice record);

    List<TNotice> selectByExample(TNoticeExample example);

    TNotice selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") TNotice record, @Param("example") TNoticeExample example);

    int updateByExample(@Param("record") TNotice record, @Param("example") TNoticeExample example);

    int updateByPrimaryKeySelective(TNotice record);

    int updateByPrimaryKey(TNotice record);
}