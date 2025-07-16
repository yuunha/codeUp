package recursion;

import java.util.Scanner;

public class CU_1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));

    }
    public static int func(int i) {
        if (i == 1) return 1;
        return i*func(i-1);
    }
}
