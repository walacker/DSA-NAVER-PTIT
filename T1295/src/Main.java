import java.util.Scanner;
class Rectangle{
    public int len ;
    public int wid ;
    public int area; 
}
public class Main {
    static int max (int a , int b , int c ){
        int max = a ;
        if (a < b)
            max = b;
        if (b < c)
            max = c;
        return max;
    }
    static Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int t = sicon.nextInt();
        sicon.nextLine();
        while(t>0){
            t-- ;
            Rectangle[] rec = new Rectangle[3];
            for(int i = 0 ; i < 3 ; i++){
                rec[i] = new Rectangle();
                rec[i].len = sicon.nextInt();
                rec[i].wid = sicon.nextInt();
                if(rec[i].len < rec[i].wid){
                    int temp = rec[i].len;
                    rec[i].len = rec[i].wid;
                    rec[i].wid = temp;
                }
                rec[i].area = rec[i].len * rec[i].wid;
            }
            int maxArea = max(rec[0].len,rec[1].len,rec[2].len);
            if((rec[0].area+rec[1].area+rec[2].area) == maxArea*maxArea)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
