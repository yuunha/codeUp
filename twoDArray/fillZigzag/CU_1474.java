package twoDArray.fillZigzag;

import java.util.Scanner;

public class CU_1474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int dir =0 ; //0:감소, 1: 증가
        int num =1;
        for (int j = (m-1); j >=0; j--) {
            if(dir==0){ //감소
                for(int i=(n-1); i>=0;i--){
                    arr[i][j] = num;
                    num++;
                }
                dir=1;
            }else{ //증가
                for(int i=0; i<n;i++){
                    arr[i][j] = num;
                    num++;
                }
                dir=0;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
