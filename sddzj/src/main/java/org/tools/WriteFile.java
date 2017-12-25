package org.tools;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteFile {
	/** */
	/**
	 * 将字节数组写入文件
	 * 
	 * @param filePath文件路径
	 * @param content
	 * @return
	 * @throws IOException
	 */
	static boolean writeBytes(String filePath, byte[] content) throws IOException {
		File file = new File(filePath);
		synchronized (file) {
			BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filePath));
			fos.write(content);
			fos.flush();
			fos.close();
		}
		return true;

	}

	public static void method1(String file, String conent) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
			out.write(conent);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
