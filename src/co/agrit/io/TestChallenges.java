package co.agrit.io;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


public class TestChallenges {
	
	public static void main(String[]args) throws IOException {
		
		// read two file and write into another one.
		
SequenceInputStream sin = new SequenceInputStream(new FileInputStream("/home/morigene/Desktop/io/buffer.txt"), new FileInputStream("/home/morigene/Desktop/io/write.txt"));
BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("/home/morigene/Desktop/io/writeIntoAnother.txt"));

int k = 0;
while( (k =  sin.read()) != -1) {
	
	bout.write(k);

}
sin.close();
bout.close();
System.out.println( " success .....");
/*
 If we need to read from more than two files we use enumeration. achieved by vector class.

Here is an example where are going to read from 4 files 
*/

FileInputStream fin  = new FileInputStream("/home/morigene/Desktop/io/buffer.txt");
FileInputStream fin2 = new FileInputStream("/home/morigene/Desktop/io/write.txt");
FileInputStream fin3 = new FileInputStream("/home/morigene/Desktop/io/writeIntoAnother.txt");
FileInputStream fin4 = new FileInputStream("/home/morigene/Desktop/io/writeIntoAnother.txt");

// Creating vector object to all  stream.
Vector<FileInputStream> v = new Vector<FileInputStream>();
v.add(fin);
v.add(fin2);
v.add(fin3);
v.add(fin4);
// creating enumeration object by calling elements method
Enumeration<FileInputStream> e = v.elements();
// Passing the enumeration object in the constructor.
SequenceInputStream bin = new SequenceInputStream(e);
int i = 0;
while( ( i = bin.read()) != -1) {
	
	System.out.print( (char)i);
}
bin.close();
fin.close();
fin2.close();
fin3.close();
fin4.close();


}
	
}
