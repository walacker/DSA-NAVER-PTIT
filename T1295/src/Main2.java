import java.util.Scanner;

public class Main2 {
    public static class haongu {
        long value;
    }

    static long ktcp(long a) {
        long b = (long) Math.sqrt(a);
        if (b * b == a)
            return b;
        b++;
        if (b * b == a)
            return b;
        return 0;
    }

    static void swap(long arr[], int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static Scanner sicon = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int t = sicon.nextInt();
        // sicon.nextLine();
        while (t > 0) {
            t--;
            long hao[] = new long[6];
            // long arr[0],b,c,d,e,f;
            for (int i = 0; i < hao.length; i++)
                hao[i] = sicon.nextLong();
            long s = hao[0] * hao[1] + hao[2] * hao[3] + hao[4] * hao[5];
            long y = ktcp(s);
            if (y == 0)
                System.out.println("NO");
            else {
                if (hao[0] > hao[1])
                    swap(hao, 0, 1);
                if (hao[2] > hao[3])
                    swap(hao, 2, 3);
                if (hao[4] > hao[5])
                    swap(hao, 4, 5);
                if (hao[1] == hao[3] && hao[3] == hao[5] && hao[5] == y)
                    System.out.println("YES");
                else {
                    if (hao[3] == y) {
                        swap(hao, 0, 2);
                        swap(hao, 1, 3);
                    }
                    if (hao[5] == y) {
                        swap(hao, 0, 4);
                        swap(hao, 1, 5);
                    }
                    if (hao[1] == y) {
                        hao[0] = y - hao[0];
                        if ((hao[2] == hao[0] && hao[4] == hao[0]) || (hao[3] == hao[0] && hao[4] == hao[0])
                                || (hao[2] == hao[0] && hao[5] == hao[0]) || (hao[3] == hao[0] && hao[5] == hao[0]))
                            System.out.println("YES");
                        else
                            System.out.println("NO");
                    } else
                        System.out.println("NO");
                }
            }
        }
    }
}
