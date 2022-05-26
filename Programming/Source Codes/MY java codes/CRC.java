import java.util.Scanner;

public class CRC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, d[], m, g[], r[], z[], i, j, k, msb, e, p, c[];
        System.out.println("Enter the no of data bits:");
        n = in.nextInt();
        System.out.println("Enter the no of generator bits:");
        m = in.nextInt();
        d = new int[n + m];
        c = new int[n + m];
        g = new int[m];
        System.out.println("Enter the data bits:");
        for (i = 0; i < n; i++)
            d[i] = in.nextInt();
        System.out.println("Enter the generator bits:");
        for (j = 0; j < m; j++)
            g[j] = in.nextInt();
        for (i = 0; i < m - 1; i++)
            d[i + n] = 0;
        r = new int[n + m];
        for (i = 0; i < m; i++)
        r[i] = d[i];
        z = new int[m];
        for (i = 0; i < m; i++)
            z[i] = 0;
            for (i = 0; i < n; i++) {
                k = 0;
                msb = r[i];
            for (j = i; j < m + i; j++) {
                if (msb == 0) {
                    r[j] = xor(r[j], z[k]);
                } else {
                    r[j] = xor(r[j], g[k]);
                }
                k++;
            }
            r[m + i] = d[m + i];
        }
        
        System.out.println("Added bits");
        for (i = n; i < n + m - 1; i++) {
            d[i] = r[i];
            System.out.print(d[i]);
        }
        System.out.println("Data bits:");
        for (i = 0; i < n + m - 1; i++) {
            System.out.print(d[i]);
            c[i] = d[i];

        }
        System.out.println("Yes(0)/No(1):");
        e = in.nextInt();
        if (e == 0) {
            System.out.println("Enter the position:");
            p = in.nextInt();
            if (d[p] == 0)
                d[p] = 1;
            else
                d[p] = 0;

        } else {
            System.out.println("No eror detected!");
        }
        for (i = 0; i < n + m - 1; i++) {
            if (c[i] == d[i])
                ;
            else {
                System.out.println("Error data is:");
                for (i = 0; i < n + m - 1; i++) {
                    System.out.print(d[i]);
                }
                System.out.println("Error detected");
                break;
            }
        }
        
    }
    public static int xor(int x, int y){
        if(x==y)
            return 0;
        else
            return 1;
    }
}