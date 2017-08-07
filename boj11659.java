import java.util.*;

public class boj11659 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList <> ();
        lst.add(0);
        for (int i = 0;i<n;i++){
            int a;
            a = sc.nextInt();
            lst.add(lst.get(i) + a);
        }
        for (int i = 0;i<m;i++){
            int b, c;
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.println(lst.get(c) - lst.get(b-1));
        }
    }
}
