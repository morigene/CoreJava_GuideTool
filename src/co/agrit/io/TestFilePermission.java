package co.agrit.io;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class TestFilePermission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String srg = "/home/morigene/Desktop/io/java.txt";
		FilePermission fi1 = new FilePermission("/home/morigene/Desktop/io/-","read");
		
		PermissionCollection permission = fi1.newPermissionCollection();
		
		permission.add(fi1);
		FilePermission file2 = new FilePermission(srg, "write");
		permission.add(file2);
		
		if(permission.implies(new FilePermission(srg, "read,write"))) {
			
			System.out.println( "Read, Write permission is granted for the path "+srg);
		}else {
			System.out.println( "No Read, Write permission is granted for the path "+srg);
		}

	}

}
