import java.io.*;
import java.net.*;

public class clientAss2{
	public static void main(String []args) throws IOException{
	Socket Myclient=new Socket("192.168.2.129", 1234);
	DataOutputStream outtoserver=new DataOutputStream(Myclient.getOutputStream());
	BufferedReader infromuser=new BufferedReader(new InputStreamReader(System.in));
	String sentence=infromuser.readLine();
	outtoserver.writeBytes(sentence);
	Myclient.close();

}

}
