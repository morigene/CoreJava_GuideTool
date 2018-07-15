package co.agrit.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestDataInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DataInputStream ins = new DataInputStream(new FileInputStream("/home/morigene/Desktop/io/write.txt"));
		int i = ins.available();
		
		byte[]ary = new byte[i];
		ins.read(ary);
		for(byte bt: ary) {
			
			char k = (char)bt;
			System.out.print( k +" - ");
		}
		

	}

}
