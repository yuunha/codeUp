package twoDArray.fillOrder;

import java.util.Scanner;

public class CU_1463 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //풀이1
        // for(int i=n;i>0;i--){
        //     for(int j=0;j<n;j++){
        //         System.out.print(i+n*j+" ");
        //     }
        //     System.out.println();
        // }

        //풀이2
        int[][] arr = new int[n][n];
        int num =1;
        for(int i=0; i<n ; i++){
            for(int j=(n-1); j>=0 ;j--){
                arr[j][i] = num;
                num++;
            }
        }
        for(int i=0; i<n ;i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
