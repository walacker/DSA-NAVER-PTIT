import java.util.Scanner;

public class Main {
    static Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int t = sicon.nextInt();
        sicon.nextLine();
        while(t>0){
            t-- ;
            String n = sicon.nextLine();
            if(notIn(n)||notDe(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    private static boolean notIn(String s){
        int x = s.length() - 1;
        //char max = '0' ; 
        for(int i = 1 ; i <= x ; i++ ){
                if(s.charAt(i) < s.charAt(i-1) ) return false ; 
        }
        return true;
    }
    private static boolean notDe(String s){
        int x = s.length() - 1;
        //char min = '9' ; 
        for(int i = 1 ; i <= x ; i++ ){
                if(s.charAt(i) > s.charAt(i-1) ) return false ; 
        }
        return true;
    }
}
