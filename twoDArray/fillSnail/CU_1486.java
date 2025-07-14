package twoDArray.fillSnail;

import java.util.Scanner;

public class CU_1486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        int rowMax = n-1, colMax = m-1;
        int rowMin = 0, colMin = 0;
        int x = 0, y = m-1 ;
        for(int num=1; num<=n*m; num++){
            arr[x][y]=num;
            if(y == colMax && x < rowMax ){
                x++;
            }else if( x == rowMax && y > rowMin){
                y--;
            }else if( y == colMin && x > colMin){
                x--;
            }else if( x == rowMin && y < colMax){
                y++;
                if(y==colMax){
                    y--;
                    x++;
                    rowMax--;
                    colMax--;
                    rowMin++;
                    colMin++;
                }
            }
            // for(int i=0; i<n; i++){
            //     for(int j=0; j<m; j++){
            //         System.out.print(arr[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            // System.out.println();

        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
