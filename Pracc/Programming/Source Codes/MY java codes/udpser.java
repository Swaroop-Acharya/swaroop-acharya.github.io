import java.io.*;
import java.net.*;
public class udpser{
    public static void main(String[] args)throws Exception {
        DatagramSocket sersock= new DatagramSocket();
        BufferedReader fromUser=new BufferedReader(new InputStreamReader(System.in));
        byte[] sendData=new byte[1024];
        InetAddress address=InetAddress.getLocalHost();
        System.out.println("Server is ready!");
        String sentence;
        sentence=fromUser.readLine();
        sendData=sentence.getBytes();
        DatagramPacket sendp=new DatagramPacket(sendData, sendData.length,address,9876);
        sersock.send(sendp);

        
    }
}