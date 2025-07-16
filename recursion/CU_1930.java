package recursion;

import java.util.Scanner;

public class CU_1930 {
    static int[][] arr = new int[15][15];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(superSum(k,n));
        }

    }
    public static int superSum(int k, int n) {
        if(k == 0) return n;
        if(arr[k][n] != 0) return arr[k][n];
        int sum=0;
        for(int i = 1; i <= n; i++){
            sum+=superSum(k-1,i);
        }
        arr[k][n] = sum;
        return sum;
    }
}
