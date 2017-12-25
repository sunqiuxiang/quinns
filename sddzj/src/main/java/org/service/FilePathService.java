package org.service;

import java.util.List;

import org.mapper.MdFilepathMapper;
import org.pojo.MdFilepath;
import org.pojo.MdFilepathExample;
import org.pojo.MdFilepathExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author quinn
 *
 */
@Service("filepathService")
public class FilePathService implements IFilePathService{
	@Autowired private MdFilepathMapper fileMapper;

	@Override
	public MdFilepath getPathByuuid(String tzuuid) {
		MdFilepathExample example = new MdFilepathExample();
		Criteria criteria = example.createCriteria();
		criteria.andTzUuidEqualTo(tzuuid);
		if (fileMapper.selectByExample(example).size()>0) {
			return fileMapper.selectByExample(example).get(0);
		}
		else {
			return null;
		}
		
	}




}
