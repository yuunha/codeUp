package nestedLoop;

import java.util.Scanner;

public class CU_1356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 2; i <= (n-1); i++) { // n=5 -> i = 2~4
            System.out.print("*");
            for(int j = 0; j < (n-2); j++) { // 3번 반복
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for(int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
