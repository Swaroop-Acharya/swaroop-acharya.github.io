import java.util.Scanner;
public class leaky{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        int buck_cap=4,rate=3,buck_rem=0,sent,recv;
        int a[]=new int[20];
        System.out.println("Enter the number of packets:");
        n=sc.nextInt();
        System.out.println("Enter the packets:");
        for(i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Clock \t Packet Sze \t Accept \t Sent \t Buck rem");
        for(i=1;i<=n;i++){
            if(a[i]!=0){
                if(buck_rem+a[i]>buck_cap){
                    recv=-1;
                }else{
                    recv=a[i];
                    buck_rem+=a[i];
                }
            }else{
                recv=0;
            }
            if(buck_rem!=0){
                if(buck_rem<rate){
                    sent=buck_rem;
                    buck_rem=0;
                }else{
                    sent =rate;
                    buck_rem =buck_rem-rate;
                }
            }else{
                sent=0;
            }
            if(recv==-1){
                System.out.println(i+"\t"+a[i]+"\t"+"dropped"+sent+"\t"+buck_rem);
            }else{
                System.out.println(i+"\t"+a[i]+"\t"+recv+"\t"+sent+"\t"+buck_rem);
            }
        }

    }
}