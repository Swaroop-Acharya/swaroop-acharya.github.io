import java.io.*;
import java.net.*;
public class udpcln{
    public static void main(String[] args)throws SocketException,IOException {
        DatagramSocket dsock=new DatagramSocket(9876);
        while(true){
            byte[] Data=new byte[1024];
            byte[] recvData=new byte[1024];
            DatagramPacket recPack=new DatagramPacket(recvData, recvData.length);
            dsock.receive(recPack);
            Data=recPack.getData();
            String str =new String(Data);
            System.out.println(str);
            


        }
        
    }
}