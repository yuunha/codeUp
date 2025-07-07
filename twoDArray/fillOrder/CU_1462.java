package twoDArray.fillOrder;

import java.util.Scanner;

public class CU_1462 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //풀이1
        // for(int i=1; i<=n; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(i+j*n+" ");
        //     }
        //     System.out.println();
        // }

        //풀이2
        int num =1;
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][i] = num;
                num++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
