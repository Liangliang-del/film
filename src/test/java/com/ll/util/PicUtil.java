package com.ll.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PicUtil {
	
	public static void copyPic(String srcS ,String destS){
		File src = new File(srcS);
		File dest = new File(destS);
		
		InputStream in = null;
		OutputStream os = null;
		
		try {
			in = new FileInputStream(src);
			os = new FileOutputStream(dest,true);
			byte[] b = new byte[1024];
			int len=0;
			while((len=in.read(b))!=-1){
				os.write(b, 0, len);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				in.close();
				os.flush();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
