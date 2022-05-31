import java.io.*;
import java.net.*;

import javax.xml.crypto.Data;
class udpcl{
    public static void main(String[] args)throws SocketException , IOException {
        DatagramSocket dsock=new DatagramSocket(9876);
        while(true){
            byte[] Data=new byte[1024];
            byte[] recieveData=new byte[1024];
            DatagramPacket recievPacket=new DatagramPacket(recieveData, recieveData.length);
            dsock.receive(recievPacket);
            Data=recievPacket.getData();
            String str=new String(Data);
            System.out.println(str);
        }
        
    }
}
