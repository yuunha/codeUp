package recursion;

import java.util.Scanner;

public class CU_1915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(func(n));
    }
    public static int func(int i) {
        if(i==1) return 1;
        else if(i ==2) return 1;
        return func(i-1)+func(i-2);
    }
    //1, 1, 2, 3, 5, 8,..
}
