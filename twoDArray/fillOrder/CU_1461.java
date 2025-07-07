package twoDArray.fillOrder;

import java.util.Scanner;

public class CU_1461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n*i ; j > n*(i-1) ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
