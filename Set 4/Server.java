import java.net.*;
import java.util.*;
import java.io.*;
class Server
{
    public static void main()throws IOException
    {
        ServerSocket ss=new ServerSocket(1080);
        Socket s=ss.accept();
        System.out.println("The Server is Open...");
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pot=new PrintWriter(s.getOutputStream(),true);
        String str=br.readLine();
        pot.println("Server: "+str);
        s.close();
    }
}