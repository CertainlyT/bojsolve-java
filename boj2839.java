import java.util.*;

public class boj2839 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n, cnt3, cnt5, less, rst;
        n = sc.nextInt();
        rst = 0;
        cnt5 = n / 5;
        less = n - cnt5 * 5;
        while (cnt5 >= 0){
            if(less % 3 == 0){
                cnt3 = less / 3;
                rst = cnt5 + cnt3;
                break;
            }
            else{
                cnt5 -= 1;
                less += 5;
            }
        }
        if (rst == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(rst);
        }
    }
}
