import java.util.*;

public class Main {
    static List<Integer> a, b, u;
    static List<List<Integer>> res = new ArrayList<>();;
    static Scanner sicon = new Scanner(System.in);

    public static void main(String[] args) {
        testcase();
    }

    static void Try(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (u.get(i) == 0) {
                b.set(i, a.get(i));
                u.set(j, 1);
                if (i == n - 1) {
                    res.add(b);
                } else
                    Try(i + 1, n);
                u.set(j, 0);
            }
        }
    }

    static void testcase() {
        int n = sicon.nextInt();
        a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sicon.nextInt());
        }
        a.sort(Comparator.naturalOrder());
        u=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            u.add(0);
        }
        b=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            b.add(0);
        }
        Try(0, n);
        res.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                for (int i = 0; i < o1.size(); i++) {
                    if (o1.get(i) > o2.get(i))
                        return 1;
                    else if (o1.get(i) < o2.get(i))
                        return -1;
                }
                return 0;
            }
        });
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
