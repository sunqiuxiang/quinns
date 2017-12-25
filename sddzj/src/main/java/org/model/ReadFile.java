package org.model;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ReadFile {
	
    /** *//**读文件到字节数组
     * @param file
     * @param pos开始字节位置
     * @param length读取长度
     * @return b为btye[]
     * @throws Exception
     */
	public  byte[] readByteyPos(byte[] file,int pos,int length) throws  Exception 
    {
        if (file.length>0) 
        {
            
            
                byte[] b = new byte[length];   
                for(int i=0;i<length;i++)
                {
                	b[i] = file[pos + i];
                }
                return b;
            
        } 
        else 
        {
            return null;
        }
        
    }
    public  byte[] readFilebyPos(File file,int pos,int length) throws  Exception 
    {
        if (file.exists() && file.isFile()) {
            long fileLength = file.length();
            if (fileLength > 0L) {
                BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
                fis.skip(pos);
                byte[] b = new byte[length];   
                fis.read(b); 
                fis.close();
                fis = null;
                return b;
            }
        } 
        else 
        {
            return null;
        }
        return null;
    }

    
    public static ArrayList<Double> readDataFile(String filePath) throws IOException {
		ArrayList<Double> al = new ArrayList<>();
		File file = new File(filePath);
		if (file.isFile() && file.exists()) { // 判断文件是否存在
			InputStreamReader read = new InputStreamReader(new FileInputStream(file));// 考虑到编码格式
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while ((lineTxt = bufferedReader.readLine()) != null) {
				double data = Double.parseDouble(lineTxt);
				al.add(data);
			}
			read.close();
		}
		return al;
	}
}
