package org.model;
public class ConvertFile {
	
    //byte[]转int型
	//bytelen=2转为short型
	//bytelen=4转为long型
    public  int bytesToInt(byte[] ascbyte,int bytelen) {

    	int intdata = 0;
    	for (int i = 0; i < bytelen; i++)
    	{int n = (ascbyte[i] < 0 ? (int)ascbyte[i] + 256 : (int)ascbyte[i]) << (8 * i);
    	intdata += n;
    	}
    	return intdata;
    	}
    
    //4字节byte[]转float
    public  float bytesToFloat(byte[] b) { 
        int floatdata = 0; 
        for ( int i = 0; i < 4; i++ ) { 
        	floatdata |= (b[i] & 0xff) << i * 8; 
        } 
        return Float.intBitsToFloat(floatdata); 
    }  
    
    //2字节byte[]转short
    public  int bytesToSInt(byte[] intByte) {

    	int fromByte = 0;
    	for (int i = 0; i < 2; i++)
    	{int n = (intByte[i] < 0 ? (int)intByte[i] + 256 : (int)intByte[i]) << (8 * i);
    	fromByte += n;
    	}
    	return fromByte;
    	} 
    
}
