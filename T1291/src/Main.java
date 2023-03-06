import java.util.Scanner;

public class Main {
    static Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int t = sicon.nextInt();
        sicon.nextLine();
        while(t>0){
            t-- ;
            String n = sicon.nextLine();
            int x = n.length() - 1;
            if((n.charAt(0)-'0')+(n.charAt(4)-'0')==(n.charAt(x)-'0')){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
