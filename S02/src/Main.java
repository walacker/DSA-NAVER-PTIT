
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
   
   static   Scanner sicon = new Scanner(System.in);
   public static void main(String[] args) {
            int t = sicon.nextInt();
            sicon.nextLine();
            for(int i = 0 ; i < t ; i++){
                  String s1 = sicon.nextLine();
                  String s2 = sicon.nextLine();
                  BigInteger bi1 = new BigInteger(s1);
                  BigInteger bi2 = new BigInteger(s2);
                  BigInteger bi3 = (bi1.multiply(bi2)).divide(bi1.gcd(bi2));
                  System.out.println( bi3 );
            }
   }
}