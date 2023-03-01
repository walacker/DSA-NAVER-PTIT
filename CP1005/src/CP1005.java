import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CP1005 {
    static   Scanner sicon = new Scanner(System.in);
    public static void main(String[] args) { 
        Map<Integer, Integer> mapInteger = new HashMap<>();
        int n = sicon.nextInt(),x;
        for(int j = 0 ; j < n ; j++){
            int t = sicon.nextInt();
            for(int i = 0 ; i < t ; i++){
                x = sicon.nextInt();
                if (!mapInteger.containsKey(x)) {
                    mapInteger.put(x, 1);
                } else {
                    mapInteger.put(x, mapInteger.get(x) + 1);
                }
            }
            for (Integer key : mapInteger.keySet()) {
                if (mapInteger.get(key) % 2 != 0) {
                    System.out.println(key);
                    break;
                }
            }
        }
        sicon.close();
    }
}