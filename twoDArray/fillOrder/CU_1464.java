package twoDArray.fillOrder;

import java.util.Scanner;

public class CU_1464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] arr = new int[h][w];
        int num = 1;
        for(int i=(h-1);i>=0;i--){
            for(int j=(w-1);j>=0;j--){
                arr[i][j] = num;
                num++;
            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
