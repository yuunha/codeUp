package twoDArray.fillHatch;

import java.util.Scanner;

public class CU_1478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int num = 1;

        for(int k=0; k<n+m-1 ;k++){
            int x,y;
            //시작점
            if(k<m){
                x =0;
                y = m-1-k;
            }else{
                x = k-m+1 ;
                y = 0;
            }

            while( x<n && y<m ){
                arr[x][y] =num;
                x++;
                y++;
                num++;
            }
        }
        for(int x=0; x<n ;x++){
            for(int y=0; y<m ;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }

    }
}
