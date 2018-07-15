package co.agrit.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class TestPushbackINputStream {

	public static void main(String[] args) throws IOException {
		
		String srg = "1##2#3###12";
		byte ary[] = srg.getBytes();
		
		ByteArrayInputStream array = new ByteArrayInputStream(ary);
		PushbackInputStream psb = new PushbackInputStream(array);
		int i ;
		while(( i = psb.read())!= -1) {
			
			if( i == '#') {
				int j;
				if((j = psb.read()) == '#') {
					System.out.print( "**");
				}else {
					psb.unread(j);
					System.out.print((char)i);
				}
			}else {
				System.out.print((char)i);
			}
		}

	}

}
