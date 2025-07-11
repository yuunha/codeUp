package twoDArray.fillSnail;

import java.util.Scanner;

public class CU_1484_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        int num=1;

        int x_min=0,y_min=0; // 시작위치
        int x_max=n-1,y_max=m-1;


        while(x_min<=x_max&&y_min<=y_max){
            for(int i=y_min; i<=y_max; i++){ //가로줄 채우기
                arr[x_min][i]=num;
                num++;
            }
            for(int i=x_min+1; i<=x_max; i++){ //세로줄 채우기
                arr[i][y_max]=num;
                num++;
            }
            if(x_max-x_min>=1&&y_max-y_min>=1){
                for(int i=y_max-1; i>=y_min; i--){
                    arr[x_max][i]=num;
                    num++;
                }
                for(int i=x_max-1; i>x_min; i--){
                    arr[i][y_min]=num;
                    num++;
                }
            }

            y_min++;
            y_max--;
            x_min++;
            x_max--;
        }





        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
