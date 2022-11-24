import java.util.*;
import java.net.*;
import java.io.*;
class Client
{
    public static void main()throws Exception
    {
        Socket s=new Socket("localhost",1080);
        Scanner sc=new Scanner(System.in);
        System.out.println("Connection Established");
        String str2=sc.nextLine();        
        InputStream ir=s.getInputStream();
        OutputStream os=s.getOutputStream();
        int str;
        byte buffer[]=str2.getBytes();
        os.write(buffer);
        while((str=ir.read())!=-1)
        {
            System.out.println((char)str);
        }
        s.close();
    }
}