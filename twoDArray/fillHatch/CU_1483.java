package twoDArray.fillHatch;

import java.util.Scanner;

public class CU_1483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int x,y;
        int num = 1;
        for (int k = 0; k < n+m-1; k++) {
            if(k<=n-1){
                x= n-k-1; //k=0.x=n-1/ k=1,x=n-2
                y=0;
            }else{
                x= 0;
                y= k-n+1; //k=n-1,y=0/ k=n,y=1
            }
            while(x<=n-1 && y<=m-1){
                arr[x][y]=num;
                num++;
                x++;
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
