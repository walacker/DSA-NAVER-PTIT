import java.util.Scanner;

public class Main {
    static   Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) {
        long t = sicon.nextInt();
        for(int j = 0 ; j < t ; j++){
            long x = sicon.nextInt();
            if(prime(x)) System.out.println(x);
            else {
                int res = (int) ((Math.sqrt(x)) *4) ; 
                for(int i = res; i >= 2 ; i--){
                    if(prime(i) && x%i==0){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
    static boolean prime( long n){
        if(n<2) return false;
        if(n==2 || n==3) return true ;
        if(n%2==0 || n%3==0) return false ;
        for(long i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0||n%(i+2)==0) return false ;
        }
        return true ;
    }
}
 