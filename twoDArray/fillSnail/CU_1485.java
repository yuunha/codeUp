package twoDArray.fillSnail;

import java.util.Scanner;

public class CU_1485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        int num = n*m;
        int x=0,y=-1;
        int row_count=n, col_count=m;
        while(row_count>0&&col_count>0){
            for(int i=0; i<col_count; i++){
                y++;
                arr[x][y]=num;
                num--;
            }
            row_count--;
            col_count--;
            for(int i=0; i<row_count; i++){
                x++;
                arr[x][y]=num;
                num--;

            }

            if(row_count>0&&col_count>0){
                for(int i=0; i<col_count; i++){
                    y--;
                    arr[x][y]=num;
                    num--;
                }
                row_count--;
                col_count--;
                for(int i=0; i<row_count; i++){
                    x--;
                    arr[x][y]=num;
                    num--;
                }

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
