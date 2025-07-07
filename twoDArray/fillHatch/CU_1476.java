package twoDArray.fillHatch;

import java.util.Scanner;

public class CU_1476 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        int i =1;
        int j =1;
        int num=1;

        while(true) {

            arr[i-1][j-1] =num;
            num++;
            if(i==n&&j==m){
                break;
            }
            if( i ==1||j==m ){ // 빗금줄의 끝에 도달
                // 다음 빗금줄로 넘어가기

                // 시작점으로 돌아가기
                while(true){
                    if( i==n || j==1){
                        break;
                    }
                    i++;
                    j--;
                }
                if( i==n ) {
                    j++;
                }else if(j==1){
                    i++;
                }

            }else{ // 빗금줄의 중간
                i--;
                j++;
            }
        }
        for(int x=0;x<n;x++){
            for(int y=0;y<m;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }

    }
}
