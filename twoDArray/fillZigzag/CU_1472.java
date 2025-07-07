package twoDArray.fillZigzag;

import java.util.Scanner;

public class CU_1472 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] arr = new int[h][w];
        int num =1;
        int d =0 ; // d=0-> 열 증가/ d=1-> 열 감소
        for(int x=(h-1);x>=0;x--){ //x = (h-1)~0
            if(d==0){ // 열y 감소
                for(int y=(w-1);y>=0;y--){
                    arr[x][y] = num;
                    num++;
                }
                d=1;
            }else{ // 열y 증가
                for(int y=0; y<w ;y++){
                    arr[x][y] = num;
                    num++;
                }
                d=0;
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
