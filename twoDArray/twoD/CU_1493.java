package twoDArray.twoD;

import java.util.Scanner;

public class CU_1493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j < m; j++) {
        //         arr[i][j] = arr[i][j] + arr[i][j-1];
        //     }
        // }
        //풀이1
        // for (int j = 0; j < m; j++) {
        //     arr1[0][j] = arr[0][j];
        // }
        // for (int i = 1; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         arr1[i][j] = arr[i][j];
        //         int k=i;
        //         while(k-1>=0){
        //             arr1[i][j] = arr1[i][j] + arr[k-1][j];
        //             k--;
        //         }
        //     }
        // }

        //arr[2][3] = arr[1][1]+[1][2]+[1][3] + [2][1]+[2][2]+[2][3]
        //            arr[1][3] = arr[1][1]+[1][2]+[1][3]
        //arr[i][j] = arr[i-1][j] + arr[i][j-n]+..arr[i][j]

        //풀이2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count=0;
                for(int k = 0; k <=i; k++) {
                    for(int l = 0; l <=j; l++) {
                        count += arr[k][l];
                    }
                }
                arr1[i][j] = count;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
