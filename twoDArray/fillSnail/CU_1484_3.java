package twoDArray.fillSnail;

import java.util.Scanner;

public class CU_1484_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        //row,col : 남은 사각형의 크기 = row * col
        int row = n, col = m;
        int num = 1;
        int x =0, y = -1;
        int dir = 1;

        while( row>0 && col>0 ){ // 종료 조건 : row=0,-1 or col=0,-1 // row=1 col=1 (O), row=0,col=1(X)
            // ex) 남은 사각형 : 4*2 -> (0,0) ,(0,1) : col번 반복-> (1,1),(2,1),(3,1) : row-1번 반복
                                 // -> (3,0) :col-1번 반복 -> (2,0),(1,0) : row-2번 반복
            for(int i=0; i<col; i++){ //반복횟수 = 열의 개수
                y=y+dir;
                arr[x][y] = num;
                num++;
            }
            row-=1;
            for(int i=0;i<row;i++){ // 반복횟수 = 남은 행의개수-1
                x=x+dir;
                arr[x][y] = num;
                num++;
            }
            col-=1;
            dir=-dir;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
