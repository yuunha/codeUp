package twoDArray.fillHatch;

import java.util.Scanner;

public class CU_1482 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int x, y;
        int num = 1;
        //시작점
        for (int k = 0; k < n + m - 1; k++) {
            if (k <= m - 1) {
                x = n-1;
                y = k; //k=0,y=0/ k=1, y=1
            } else {
                x = n + m - 2 - k; //k=m-1,x=n-1/ k=m,x=n-2
                y = m - 1;
            }

            while (y >= 0 && x >= 0) {
                arr[x][y] = num;
                x--;
                y--;
                num++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
