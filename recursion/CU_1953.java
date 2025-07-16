package recursion;

import java.util.Scanner;

public class CU_1953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
    public static void func(int n) {
        if (n == 0) return;
        func(n - 1);
        System.out.println("*".repeat(n));

    }
}
