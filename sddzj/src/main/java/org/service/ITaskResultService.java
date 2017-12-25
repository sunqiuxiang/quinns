package org.service;

import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;


public interface ITaskResultService {
	public SequenceInputStream getResultInputStream(int taskid);

}
