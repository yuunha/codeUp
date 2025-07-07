package nestedLoop;

import java.util.Scanner;

public class CU_1677 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < m ; i++) {
            if( i==0 || i == m-1) {
                System.out.print("+");
                for(int j = 0; j < n-2; j++) {
                    System.out.print("-");
                }
                System.out.print("+");
                System.out.println();
            }
            else{
                System.out.print("|");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.println();
            }
        }
    }
}
