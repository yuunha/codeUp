package nestedLoop;

import java.util.Scanner;

public class CU_1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i+" "+ j);
                System.out.println();
            }

        }
    }
}

