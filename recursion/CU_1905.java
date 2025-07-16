package recursion;

import java.util.Scanner;

public class CU_1905 {
    //풀이 1 : 전역변수 sum
    // static int sum = 0;
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     func(n);
    //     System.out.println(sum);
    // }
    // public static void func(int a){
    //     if(a == 0){
    //         return;
    //     }
    //     sum+=a;
    //     func(a-1);
    // }

    //풀이2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }
    public static int func(int n) {
        if(n == 1) return 1;
        return n+func(n-1);
    }
}
