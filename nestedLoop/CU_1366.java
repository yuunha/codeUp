package nestedLoop;

import java.util.Scanner;

public class CU_1366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if( i == j || (i+j) == (n+1) || i == 1 || i==n || j==1 || j == n || i==(n+1)/2 || j==(n+1)/2   ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
