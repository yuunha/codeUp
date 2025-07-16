package recursion;

import java.util.Scanner;

public class CU_3702 {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        //삼각형 층수
        int lay = r+c-1;
        arr = new int[lay][lay];


        System.out.println(func(r-1,c-1));
    }

    //private 사용 위치 = 자기 자신 classs?
    private static int func(int i, int j) {
        if(i==0||j==0) return 1;
        else if(arr[i][j]!=0) return arr[i][j];
        else{
            arr[i][j] = (func(i,j-1) + func(i-1,j))%100000000;
            return arr[i][j];
        }

    }

}
