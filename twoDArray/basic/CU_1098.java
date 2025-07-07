package twoDArray.basic;

import java.util.Scanner;

public class CU_1098 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //격자판
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
            int l = sc.nextInt();
            int d = sc.nextInt(); // 0이면 가로
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            if(d==0){
                for(int j = 0; j < l; j++){
                    arr[x][y+j] = 1;
                }
            }else{
                for(int j = 0; j < l; j++){
                    arr[x+j][y] = 1;
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
