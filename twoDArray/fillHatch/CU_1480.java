package twoDArray.fillHatch;

import java.util.Scanner;

public class CU_1480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        int num = 1;

        for(int k=0;k<n+m-1;k++){
            //num=1  ->  (n-1,m-1)
            int x,y;

            //시작점
            if(k<=(n-1)){
                x= (n-1)-k; //k=0,x=(n-1) / k=1,x=n-2/ k=2, x=n-3
                y= m-1;
            }else{
                x= 0;
                y= n+m-2-k; // k=n-1,y=m-1/ k=n, y=m-2/ k=n+m-2, y= 0

            }

            while( x <= n-1 && 0<=y ){
                arr[x][y]=num;
                x++;
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
