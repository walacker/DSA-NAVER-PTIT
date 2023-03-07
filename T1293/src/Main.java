import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //int t = sicon.nextInt();
        //sicon.nextLine();
        List<Integer> tmp = new ArrayList<>();
        int[] dem = new int[1000000];
        while(sicon.hasNext()){
            int n = sicon.nextInt();
            if(isPrime(n)==1) { 
                tmp.add(n);
                dem[n]++;
            }
        }
        for(int i = 0 ; i < tmp.size() ; i++){
            System.out.println(tmp.get(i)+" "+dem[tmp.get(i)]);
        }
    }
    static int prime( int n){
        if(n<2) return 0;
        if(n==2 || n==3) return 1 ;
        if(n%2==0 || n%3==0) return 0 ;
        for(int i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0||n%(i+2)==0) return 0 ;
        }
        return 1 ;
    }
    static int isPrime(int n){
        while(n>0){
            int r = n % 10 ; 
            if(prime(r)!=1) return 0  ; 
            n = n / 10 ; 
        }
        return 1 ; 
    }
}
