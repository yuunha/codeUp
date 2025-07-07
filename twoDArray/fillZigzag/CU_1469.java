package twoDArray.fillZigzag;

import java.util.Scanner;

public class CU_1469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int num = 1;
        for(int i=0;i<n;i++) {
            if(i%2==0){ //짝수 행
                for(int j=(n-1);j>=0 ;j--) {
                    arr[i][j] = num;
                    num++;
                }
            }else{ //홀수 행
                for(int j=0;j<n;j++){
                    arr[i][j] = num;
                    num++;
                }
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
