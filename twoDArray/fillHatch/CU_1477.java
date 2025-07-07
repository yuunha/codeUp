package twoDArray.fillHatch;

import java.util.Scanner;

public class CU_1477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        int i =0;
        int j =0;
        int num=1;
        int startX=0;
        int startY=0;
        while(true){

            arr[i][j] =num;
            num++;
            //(n-1,m-1)에 도달 시, 종료
            if(i==n-1&&j==m-1){
                break;
            }

            if(i==(n-1)||j==0){// 끝에 도달시
                //다음 줄로 넘어가기
                if(startY < m-1){
                    i=startX;
                    j=++startY; // startY++ -> j=startY
                }else{ //startY =m-1
                    i=++startX;
                    j=startY;
                }
            }else{ //끝이 아닌 경우
                //(같은 줄)다음 칸으로 넘어가기
                i++;
                j--;
            }

        }
        for(int k=0;k<n;k++){
            for(int l=0;l<m;l++){
                System.out.print(arr[k][l]+" ");
            }
            System.out.println();
        }

    }
}
