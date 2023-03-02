import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public void permutate(int[] arr, int i, int n, List<List<Integer>> res) {
        if (i == n) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                tmp.add(arr[j]);
            }
            res.add(tmp);
        } else {
            for (int j = i; j < n; j++) {
                swap(arr, i, j);
                permutate(arr, i + 1, n, res);
                swap(arr, i, j);
            }
        }
    }
    
    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sicon = new Scanner(System.in);
        int n = sicon.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sicon.nextInt();
        }
        List<List<Integer>> res = new ArrayList<>();
        s.permutate(arr, 0, arr.length, res);
        res.sort((o1, o2) -> {
            for (int i = 0; i < o1.size(); i++) {
                if (o1.get(i) > o2.get(i))
                    return 1;
                else if (o1.get(i) < o2.get(i))
                    return -1;
            }
            return 0;
        });
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
