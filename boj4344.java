import java.util.*;

public class boj4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double a;
            ArrayList <Integer> b = new ArrayList <> ();
            a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                b.add(sc.nextInt());
            }
            double sum;
            sum = 0;
            for(int k = 0; k < b.size(); k++) {
                sum += b.get(k);
            }
            double avg = sum / a;
            double cnt = 0;
            for(int k = 0; k < b.size(); k++) {
                if (avg < b.get(k)) {
                    cnt += 1;
                }
            }
            double rst;
            rst = cnt / a * 100;
            System.out.printf("%.3f", rst);
            System.out.println("%");
        }
    }
}