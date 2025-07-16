package recursion;

import java.util.Scanner;

public class CU_4564 {
    static int[] arr;
    static int[] arr_max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];
        arr_max = new int[n+1];
        for (int i = 1; i <=n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Math.max(arr[1]+sum(3,n), sum(2,n));
        max = Math.max(max, arr[1]+arr[2]+sum(4,n));
        System.out.println(max);
    }
    private static int sum(int a,int n) {
        //System.out.println(a+" "+n);

        if(a==n) return arr[a];
        if(a==n-1) return arr[a]+arr[a+1];
        if(a==n-2) return arr[a]+arr[a+2];
        if(arr_max[a]!=0) return arr_max[a];
        else{
            arr_max[a]=Math.max(arr[a]+sum(a+2,n), arr[a]+arr[a+1]+sum(a+3,n));
        }
        return arr_max[a];
    }
}
