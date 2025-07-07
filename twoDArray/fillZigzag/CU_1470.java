package twoDArray.fillZigzag;

import java.util.Scanner;

public class CU_1470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int num = 1;
        for(int y=0;y<n;y++){ //0,1,2...열
            if(y%2==0){ //짝수열
                for(int x=0;x<n;x++){ // 행 = 0~(n-1)
                    arr[x][y] = num;
                    num++;
                }
            }else{ //홀수 열
                for(int x=(n-1);x>=0;x--){
                    arr[x][y] = num;
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
