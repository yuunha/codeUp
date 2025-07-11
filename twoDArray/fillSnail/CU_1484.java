package twoDArray.fillSnail;

import java.util.Scanner;

public class CU_1484 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        //시계방향으로 도는 횟수 구하기


        int rowm=0,rowM=n-1;
        int colm=0,colM=m-1;
        int x=0,y=0;
        for(int num=1; num<=n*m ; num++){
            arr[x][y]= num;
            if(x==rowm &&y<colM){ //왼쪽위->오른쪽 위
                y++;
            }else if(x<rowM && y==colM){
                x++;
            }else if(x==rowM && y>colm){
                y--;
            }else if(x>rowm && y==colm){
                x--;
                if(arr[x][y]!=0){
                    colm++;
                    colM--;
                    rowm++;
                    rowM--;
                    x++;
                    y++;
                }
            }
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
