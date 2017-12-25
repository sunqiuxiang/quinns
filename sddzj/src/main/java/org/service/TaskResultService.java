package org.service;

import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import org.mapper.MdtwMapper;
import org.mapper.TTaskMapper;
import org.mapper.TTaskResultSparkMapper;
import org.pojo.Mdtw;
import org.pojo.MdtwExample;
import org.pojo.TTaskResultSpark;
import org.pojo.TTaskResultSparkExample;
import org.pojo.TTaskResultSparkExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingh.filemanager.HDFSFile;
import com.bingh.filemanager.HDFSFileManager;

/**
 * 
 * @author quinn
 *
 */
@Service("taskResultService")
public class TaskResultService implements ITaskResultService{
	@Autowired private TTaskResultSparkMapper taskresultMapper;
	@Autowired private TTaskMapper taskMapper;

	@Override
	public SequenceInputStream getResultInputStream(int taskid) {
		if (taskMapper.updates(taskid) == 1) {
			Vector<InputStream> streams = new Vector<>();
			TTaskResultSparkExample example = new TTaskResultSparkExample();
			Criteria criteria = example.createCriteria();
			criteria.andTaskIdEqualTo(taskid);
			List<TTaskResultSpark> list = taskresultMapper.selectByExample(example);
			HDFSFileManager fileManager = new HDFSFileManager();
			for (int i = 0; i < list.size(); i++) {
				InputStream is = fileManager.open(new HDFSFile(list.get(i).getResultPath()));
				streams.add(is);
			}
			Enumeration<InputStream> elements = streams.elements();
			SequenceInputStream iss = new SequenceInputStream(elements);
			return iss;
		}else {
			return null;
		}
		
	}



}
