import java.util.Scanner;

public class Main {
    static void xyly(long n){
        long temp = 0 , dem = 1 ;
        while(n/10 > 0){
            if(n%10+ temp >=5) temp = 1 ; 
            else temp = 0 ;
            n = n/10; 
            dem = dem * 10 ; 
        }
        long res = (n+temp)*dem ; 
        System.out.println(res);
    }
    static   Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sicon.nextInt();
        for(int i = 0 ; i < t ; i++) {
            long n = sicon.nextLong();
            xyly(n);
        }
    }
}
 