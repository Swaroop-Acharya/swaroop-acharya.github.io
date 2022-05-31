import java.io.*;
import java.net.*;
class tcpcln{
    public static void main(String[] args)throws Exception{
        Socket sock=new Socket("127.0.01",4000);
        BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the filename:");
        String fname=keyRead.readLine();
        OutputStream oStream=sock.getOutputStream();
        PrintWriter pWriter=new PrintWriter(oStream,true);
        pWriter.println(fname);
        InputStream iStream =sock.getInputStream();
        BufferedReader socketRead=new BufferedReader(new InputStreamReader(iStream));
        String str;
        System.out.println("---------------------------");
        while((str=socketRead.readLine())!=null){
            System.out.println(str);
        }
        pWriter.close();
        socketRead.close();
        keyRead.close();
        
    }
}