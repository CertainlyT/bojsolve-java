import java.util.*;

public class boj2439 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
