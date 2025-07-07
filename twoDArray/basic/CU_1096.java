package twoDArray.basic;

import java.util.Scanner;

public class CU_1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[19][19];
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a-1][b-1]=1;
        }
        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 19; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
