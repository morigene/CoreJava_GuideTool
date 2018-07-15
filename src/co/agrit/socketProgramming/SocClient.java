package co.agrit.socketProgramming;



import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class SocClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int port = 8080;
		String ip   = "127.0.0.1";
		String text = " Welcome to socking programming ";
		
		try {
		
			Socket s = new Socket(ip, port);
			OutputStreamWriter out = new OutputStreamWriter(s.getOutputStream());
			
			PrintWriter pw = new PrintWriter(out);
			out.write( text);
			out.flush();
			s.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
