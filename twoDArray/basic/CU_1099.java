package twoDArray.basic;

import java.util.Scanner;

public class CU_1099 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int x=1;
        int y=1;

        while(true){ // 탐색 가능한 x,y에 대해

            if(arr[x][y]==2){ // 현재 위치가 먹이 위치인 경우
                arr[x][y] = 9;
                break;
            }
            arr[x][y] = 9;

            if(arr[x][y+1]==0||arr[x][y+1]==2){ //오른쪽 이동 가능 시,
                y++;           //오른쪽으로 이동
            }
            else if(arr[x+1][y]==0||arr[x+1][y]==2){ //아래쪽 이동 가능 시,
                x++;                    //아래로으로 이동
            }
            else{ //도착하거나, 더 이상 움직일 수 없는 경우
                break; //멈춤
            }
        }

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
