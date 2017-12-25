package org.service;

import java.util.List;

import org.mapper.TNoticeMapper;
import org.pojo.TNotice;
import org.pojo.TNoticeExample;
import org.pojo.TNoticeExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author quinn
 *
 */
@Service("noticeService")
public class NoticeService implements INoticeService{
	@Autowired private TNoticeMapper noticeMapper;

	@Override
	public int add(TNotice tt) {
		return noticeMapper.insert(tt);
	}

	@Override
	public List<TNotice> getlist() {
		TNoticeExample example = new TNoticeExample();
		example.setOrderByClause("notice_start_time DESC");
		Criteria criteria = example.createCriteria();
		criteria.andNoticeStatusEqualTo(200);
		return noticeMapper.selectByExample(example);
	}

	@Override
	public TNotice getnoticeByuuid(String uuid) {
		TNoticeExample example = new TNoticeExample();
		Criteria criteria = example.createCriteria();
		criteria.andUuidEqualTo(uuid);
		
		return noticeMapper.selectByExample(example).size()>0?noticeMapper.selectByExample(example).get(0):null;
	}



}
