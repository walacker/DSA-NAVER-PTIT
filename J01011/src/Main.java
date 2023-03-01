import java.util.Scanner;

public class Main {
    static long gcd(long a, long b)
    {
        long i;
        if (a < b)
            i = a;
        else
            i = b;
        for (long j = i; j > 1; j--) {
            if (a % j == 0 && b % j == 0)
                return j;
        }
        return 1;
    }

    static   Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) {
        long t = sicon.nextInt();
        for(int i = 0 ; i < t ; i++){
            long x = sicon.nextInt();
            long y = sicon.nextInt();
            System.out.println((x*y)/gcd(x,y)+" "+gcd(x,y));
        }
        sicon.close();
    }
    
}