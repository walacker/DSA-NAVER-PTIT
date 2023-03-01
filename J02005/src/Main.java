import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static   Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sicon.nextInt();
        int m = sicon.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] dd = new int[1005];

        for (int i = 0; i < n; i++) {
            a[i] = sicon.nextInt();
            dd[a[i]] = 1; // xuất hiện
        }
        for (int i = 0; i < m; i++) {
            b[i] = sicon.nextInt();
        }

        Arrays.sort(b);
        for (int i = 0; i < m; i++) {
            if (dd[b[i]] == 1) {
                System.out.print(b[i] + " ");
                dd[b[i]] = 2; // xuất hiện nhưng đã in
            }
        }
    }
}
 