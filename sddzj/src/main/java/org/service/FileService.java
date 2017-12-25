package org.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.dao.FileDao;
import com.bingh.filemanager.HDFSFile;
import com.bingh.result.Result;

public class FileService {
	private FileDao dao = new FileDao();
	/**
	 * 获取文件列表
	 * @param filePath
	 * @return
	 */
	public List<HDFSFile> getList(String filePath){
		Result<HDFSFile> result = dao.getList(filePath);
		if(result.isSuccess()){
			return result.getList();
		}else{
			System.out.println(result.getMsg());
			return null;
		}
	}
	/**
	 * 下载文件
	 * @param filePath
	 * @return
	 */
	public InputStream downloadFile(String filePath){
		InputStream inputStream = null;
		inputStream = dao.open(filePath);
		return inputStream;
	}
	
	/**
	 * 删除文件(夹) 可递归
	 * @param filePath
	 * @return
	 */
	public String deleteFile(String filePath){
		Result<HDFSFile> delete = dao.delete(filePath);
		if(delete.isSuccess()){
			return "{\'success\':true}";
		}else{
			return "{\'success\':false,\'msg\':\'"+delete.getMsg()+"\'}";
		}
	}
	
	/**
	 * 文件(夹)重命名
	 * @param oldPath
	 * @param newPath
	 * @return
	 */
	public String renameFile(String oldPath,String newPath){
		Result<HDFSFile> rename = dao.rename(oldPath, newPath);
		if(rename.isSuccess()){
			return "{\'success\':true}";
		}else{
			return "{\'success\':false,\'msg\':\'"+rename.getMsg()+"\'}";
		}
	}
	/**
	 * 新建文件夹
	 * @param filePath
	 * @return
	 */
	public String mkdir(String filePath){
		Result<HDFSFile> mkdir = dao.mkdir(filePath);
		if(mkdir.isSuccess()){
			return "{\'success\':true}";
		}else{
			return "{\'success\':false,\'msg\':\'"+mkdir.getMsg()+"\'}";
		}
	}
	/**
	 * 批量删除文件
	 * @param filePaths
	 * @return
	 */
	public String batchDelete(String[] filePaths){
		List<Boolean> list = new ArrayList<>();
		for (String filePath : filePaths) {
			Result<HDFSFile> delete = dao.delete(filePath);
			list.add(delete.isSuccess());
		}
		Boolean resultFlag = true;
		for (Boolean flag : list) {
			resultFlag = resultFlag&&flag;
		}
		
		if(resultFlag){
			return "{\'success\':true}";
		}else{
			return "{\'success\':false,\'msg\':\'部分文件删除失败\'}";
		}
	}
	
	public List<HDFSFile> searchFiles(String path,String keyword){
		List<HDFSFile> searchFilesByKeyWordContainedInFileName = dao.searchFilesByKeyWordContainedInFileName(path, keyword);
		return searchFilesByKeyWordContainedInFileName;
	}
	
}
