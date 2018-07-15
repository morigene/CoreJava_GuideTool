package co.agrit.socketProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println( " Server is started ");
		ServerSocket sv = new ServerSocket(8080);
		System.out.println( " The server is waiting the request from client ");
		Socket s = sv.accept();
		System.out.println( " The client is connected ");	
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		
		System.out.println( " The client says   "+str);
		
		s.close();
		sv.close();

	}

}
