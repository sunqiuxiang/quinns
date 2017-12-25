package org.model;
/**
 * EvtFile实体类
 * @author lixiang
 *
 */
public class EvtFile {
	private String uuid;
	private String fileName;
	private String filePath;
	private String type;
	private boolean filedo=false;
	private boolean fileDoFinished=false;
	
	public void setFileDo(boolean bDo)
	{
		filedo = bDo;
	}
	public boolean getFileDo()
	{
		return filedo;
	}
	public void setFileDoFinished(boolean bDo)
	{
		fileDoFinished = bDo;
	}
	public boolean getFileDoFinished()
	{
		return fileDoFinished;
	}

	public EvtFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EvtFile(String uuid, String fileName, String filePath, String type) {
		super();
		this.uuid = uuid;
		this.fileName = fileName;
		this.filePath = filePath;
		this.type = type;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	@Override
	public String toString() {
		return "EvtFile [uuid=" + uuid + ", fileName=" + fileName + ", filePath=" + filePath + ", type=" + type + "]";
	}
	
	
}
