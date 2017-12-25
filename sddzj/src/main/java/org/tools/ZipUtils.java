package org.tools;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtils {
	    
	    public static void doCompress(List<String> pathname, String zipFile) throws Exception {
	        doCompress(pathname, new File(zipFile));
	    }
	    public static void hdfsdoCompress(List<String> pathname, String zipFile) throws Exception {
	    	String dFileName = "/tmp/zip/" + UUID.randomUUID().toString() + ".zip";
	        File destFile = new File(dFileName);
	        if(!destFile.exists())
	        	destFile.createNewFile();
	        try
	        {
	        	ZipOutputStream out = new ZipOutputStream(new FileOutputStream(destFile));
	            for(String file : pathname)
	            {
	            	try
	            	{
	            		File evtFile = new File(file);
	            		FileInputStream evt= new FileInputStream(file);
	            		//FileSystem fileSystem = FileSystem.get(URI.create(PropsUtils.getUri("uri")), new Configuration(),PropsUtils.getUser("user"));
	            		//FSDataInputStream eInputStream = fileSystem.open( new Path(file) );
	            		String[] ftitle = file.split("/");
	            		byte[] buffer = new byte[1024];
	                    out.putNextEntry(new ZipEntry(ftitle[ftitle.length-1]));
	                    int len = 0 ;
	                    // 读取文件的内容,打包到zip文件    
	                    while ((len = evt.read(buffer)) > 0) {
	                        out.write(buffer, 0, len);
	                    }
	                    out.flush();
	                    out.closeEntry();
	                    evt.close();
	                   
	            	}
	            	catch(Exception e)
	            	{
	        			
	        		}
	               // doCompress(new File(file), out);
	        		
	            }
	            out.finish();
	            out.close();
	        }
	        catch(Exception e)
	    	{
				
			}
	        
	        try
	        {
	        	File evtFile = new File(zipFile);
	        	if(!evtFile.exists())
	        		evtFile.createNewFile();
	        	
	        	BufferedOutputStream evt = new BufferedOutputStream(new FileOutputStream(zipFile));
	    		//FileInputStream evt= new FileInputStream();
	    		
	    		//FileSystem fileSystem = FileSystem.get(URI.create(PropsUtils.getUri("uri")), new Configuration(),PropsUtils.getUser("user"));
	    		//FSDataOutputStream uOutputStream = fileSystem.create(new Path(zipFile));
	    		
	    		
	    		
	    		byte[] buffer = new byte[1024];
	            int len = 0 ;
	            BufferedInputStream  in = new BufferedInputStream(new FileInputStream(destFile));  
	            // 读取文件的内容,打包到zip文件    
	            while ((len = in.read(buffer)) > 0) {
	            	evt.write(buffer, 0, len);
	            }
	            evt.flush();
	            evt.close();
	    		in.close();
	    		//destFile.delete();
	        }
	        catch(Exception e)
	        {
	        	
	        }
	    }
	    /**
	     * 文件压缩
	     * @param srcFile  目录或者单个文件
	     * @param destFile 压缩后的ZIP文件
	     */
	    public static void doCompress(List<String> pathname, File destFile) throws Exception {
	        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(destFile));
	 
	            for(String file : pathname)
	            {
	                doCompress(new File(file), out);
	            }
	            out.finish();
	            out.close();
	    }
	    
	    
	    
	    public static void doCompress(File file, ZipOutputStream out) throws IOException{
	        if( file.exists() )
	        {
	            byte[] buffer = new byte[1024];
	            FileInputStream fis = new FileInputStream(file);
	            out.putNextEntry(new ZipEntry(file.getName()));
	            int len = 0 ;
	            // 读取文件的内容,打包到zip文件    
	            while ((len = fis.read(buffer)) > 0) {
	                out.write(buffer, 0, len);
	            }
	            out.flush();
	            out.closeEntry();
	            fis.close();
	        }
	    }
	    
	
}
