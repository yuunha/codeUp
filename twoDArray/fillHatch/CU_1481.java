package twoDArray.fillHatch;

import java.util.Scanner;

public class CU_1481 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        int num = 1;
        for(int k=0;k<n+m-1;k++){
            int x,y;

            if(k<=m-1){
                x= n-1;
                y= (m-1)-k; //k=0,y=m-1/ k=1, y=m-2
            }
            else{
                x= n+m-2-k; //k=m-1,x=n-1/ k=m, x=n-2/ k=n+m-2, x=0
                y= 0;
            }

            while( x>=0&& x<=n-1&& y>=0 &&y<=m-1 ){
                arr[x][y]=num;
                num++;
                x--;
                y++;
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
