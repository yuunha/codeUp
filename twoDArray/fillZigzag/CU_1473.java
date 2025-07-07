package twoDArray.fillZigzag;

import java.util.Scanner;

public class CU_1473 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] arr = new int[h][w];
        int num =1;
        int dir = 0;
        for(int x = (h-1);x>=0 ; x--){
            if(dir==0){ // y증가
                for(int y=0;y<w;y++){
                    arr[x][y] = num;
                    num++;
                }
                dir=1;
            }else{ // y 감소
                for(int y=(w-1);y>=0;y--){
                    arr[x][y] = num;
                    num++;
                }
                dir=0;
            }
        }
        for(int x=0;x<h;x++){
            for(int y=0;y<w;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }
}
