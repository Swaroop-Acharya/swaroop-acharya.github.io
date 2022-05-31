import java.io.IOException;
import java.io.DataInputStream;
import java.math.BigInteger;
import java.util.Random;
public class RSA{
    private BigInteger p,q,N,phi,e,d;
    private int bitlength=1024;
    private Random r;
    public RSA(){
        r=new Random();
        p=BigInteger.probablePrime(bitlength,r);
        q=BigInteger.probablePrime(bitlength,r);
        N=p.multiply(q);
        phi=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e=BigInteger.probablePrime(bitlength/2,r);
        while(phi.gcd(e).compareTo(BigInteger.ONE)>0 && e.compareTo(phi)<0)
        {
            e.add(BigInteger.ONE);
        }
        d=e.modInverse(phi);
    }
    public RSA(BigInteger e, BigInteger d , BigInteger N)
    {
        this.e=e;
        this.d=d;
        this.N=N;
    }

    public static void main(String[] args)throws IOException {
        RSA rsa=new RSA();
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter the text:");
        String teststring;
	teststring=in.readLine();
        System.out.println("Encrypting the text"+teststring);
        byte[] encrypted=rsa.encrypt(teststring.getBytes());
        byte[] decrypted=rsa.decrypt(encrypted);
        System.out.println("Decrypting the string"+ new String(decrypted));

    }
    
        public byte[] encrypt(byte[] message)
        {
            return (new BigInteger(message).modPow(e,N).toByteArray());
        }
        public byte[] decrypt(byte[] message)
        {
            return (new BigInteger(message).modPow(d,N).toByteArray());
        }
        
}