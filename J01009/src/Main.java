import java.util.Scanner;

public class Main {
    static   Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) {
        long t = sicon.nextInt();
        long res = 0  , dem = 1 ; 
        for(int i = 1 ; i <= t ; i++){
            dem *= i ; 
            res += dem ; 
        }
        System.out.println(res);
        sicon.close();
    }
    
}
 