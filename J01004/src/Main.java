import java.util.Scanner;

public class Main {
    static  long prime( long n){
        if(n<2) return 0;
        if(n==2 || n==3) return 1 ;
        if(n%2==0 || n%3==0) return 0 ;
        for(long i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0||n%(i+2)==0) return 0 ;
        }
        return 1 ;
    }
    static   Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) {
        long t = sicon.nextInt();
        for(int i = 0 ; i < t ; i++){
            long x = sicon.nextInt();
            if(prime(x)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
 