package org.dao;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bingh.filemanager.HDFSFile;
import com.bingh.filemanager.HDFSFileManager;
import com.bingh.result.Result;

public class FileDao {
	@Autowired private HDFSFileManager fileManager = new HDFSFileManager();
	
	public Result<HDFSFile> getList(String filePath){
		Result<HDFSFile> list = fileManager.getList(new HDFSFile(filePath));
		return list;
	}
	
	public InputStream open(String filePath){
		InputStream inputStream = null;
		inputStream = fileManager.open(new HDFSFile(filePath));
		return inputStream;
	}
	
	public Result<HDFSFile> delete(String filePath){
		Result<HDFSFile> delete = fileManager.delete(new HDFSFile(filePath));
		return delete;
	}
	
	public Result<HDFSFile> rename(String oldName,String newName){
		Result<HDFSFile> rename = fileManager.rename(new HDFSFile(oldName), new HDFSFile(newName));
		return rename;
	}
	
	public Result<HDFSFile> move(String oldPath,String newPath){
		Result<HDFSFile> move = fileManager.move(new HDFSFile(oldPath), new HDFSFile(newPath));
		return move;
	}
	
	public Result<HDFSFile> mkdir(String filePath){
		Result<HDFSFile> mkdir = fileManager.mkdir(new HDFSFile(filePath));
		return mkdir;
	}
	
	public List<HDFSFile> searchFilesByKeyWordContainedInFileName(String path,String keyword){
		Result<HDFSFile> result = fileManager.find(path, keyword);
		return result.getList();
	}
	
}
