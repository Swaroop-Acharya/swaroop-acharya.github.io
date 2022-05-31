import  java.net.*;
import java.io.*;
public class tcpser{
    public static void main(String[] args)throws Exception {
        ServerSocket sersock=new ServerSocket(4000);
        System.out.println("Server is ready!!");
        Socket sock=sersock.accept();
        System.out.println("Connection successfull and ready for chatting");
        InputStream iStream=sock.getInputStream();
        BufferedReader fileRead=new BufferedReader(new InputStreamReader(iStream));
        String fname;
        fname=fileRead.readLine();
        BufferedReader Content=new BufferedReader(new FileReader(fname));
        OutputStream oStream=sock.getOutputStream();
        PrintWriter pwrite=new PrintWriter(oStream,true);
        String str;
        while((str=Content.readLine())!=null){
            pwrite.println(str);  
        }
        pwrite.close();
        fileRead.close();
        sock.close();
        Content.close();
    }
}