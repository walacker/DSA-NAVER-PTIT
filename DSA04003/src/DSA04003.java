
import java.util.Scanner;

public class DSA04003 {
    public static final long MOD = 123456789;
    public static long Solve(long n, long k){
        if(k == 0) return 1;
        long x = Solve(n, k/2);
        long res = (n * (x * x%MOD)) % MOD ; 
        if(k % 2 != 0 ) return res ;
        return x * x%MOD;
    }
    static   Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) { 
        int n = sicon.nextInt();
        long res = 0 ;
        for(int j = 0 ; j < n ; j++){
                long x = sicon.nextInt();
                res = Solve(2,x-1); 
            System.out.println(res);
        }
        sicon.close();
    }
}