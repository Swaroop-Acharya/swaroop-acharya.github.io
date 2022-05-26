
import java.util.Scanner;

public class Crc2 {

    public static void main(String[] args) {
        int m, n, i, j, k, e, p, msb, d[], g[], r[], c[], z[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no data bits");
        n = sc.nextInt();
        System.out.println("Enter the no generator bits");
        m = sc.nextInt();
        d = new int[n + m];
        g = new int[m];
        c = new int[n + m];
        System.out.println("Enter the data bits");
        for (i = 0; i < n; i++)
            d[i] = sc.nextInt();
        System.out.println("Enter the generator bits");
        for (j = 0; j < m; j++)
            g[j] = sc.nextInt();
        for (i = 0; i < m - 1; i++)
            d[n + i] = 0;
        r = new int[m + n];
        for (i = 0; i < m; i++)
            r[i] = d[i];
        z = new int[m];
        for (i = 0; i < m; i++)
            z[i] = 0;
        for (i = 0; i < n; i++) {
            for (j = i; j < m + i; j++) {
                k = 0;
                msb = r[i];
                if (msb == 0)
                    r[j] = xor(r[j], z[k]);
                else
                    r[j] = xor(r[j], z[k]);
                k++;
            }
            r[m + i] = d[m + i];
        }
        System.out.println("The code bits added are\n");
        for (i = n; i < n + m - 1; i++) {
            d[i] = r[i];
            System.out.println(d[i]);
        }
        System.out.println("The code data added is\n");
        for (i = 0; i < n + m - 1; i++) {
            System.out.println(d[i]);
            c[i] = d[i];
        }
        System.out.println("Do you want to make an error?Yes(0)/No(1)");
        e = sc.nextInt();
        if (e == 0) {
            System.out.println("Enter the position\n");
            p = sc.nextInt();
            if (d[p] == 0) {
                d[p] = 1;
            } else {
                d[p] = 0;
            }
        } else {
            System.out.println("No error detected");

        }
        for (i = 0; i < n + m - 1; i++) {
            if (c[i] == d[i])
                ;
            else {
                System.out.println("Erraneous data is\n");
                for (i = 0; i < n + m - 1; i++) {
                    System.out.println(d[i]);
                }
                System.out.println("No error detected");
                break;
            }
        }
    }

    public static int xor(int x, int y) {
        if (x == y)

            return 0;
        else
            return 1;
    }
}