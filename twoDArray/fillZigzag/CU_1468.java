package twoDArray.fillZigzag;

import java.util.Scanner;

public class CU_1468 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        int j =0;
        int num =1;
        for(int i=0; i<n ; i++){ // 0,1,2,3... 행에 대해
            for(int k=0; k<n ; k++){  // n개의 열에 대해
                if(i%2==0){ // 0,2,4 행 -> 증가
                    arr[i][j] = num;
                    num++;
                    if(j<n-1){
                        j++;
                    }
                }else{
                    arr[i][j] = num;
                    num++;
                    if(j>0){
                        j--;
                    }
                }
            }
        }
        for(int i=0; i<n ; i++){
            for(int k=0; k<n ; k++){
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }
    }
}
