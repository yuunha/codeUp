package nestedLoop;

import java.util.Scanner;

public class CU_1369 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String[][] arr = new String[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = " ";
            }
        }
        for (int i = 0; i < n; i++) {
            arr[0][i] = "*";
            arr[n-1][i] = "*";
            arr[i][0] = "*";
            arr[i][n-1] = "*";
        }


        int start = k-1; //3
        for (int i = 0; i < n; i++) { // i층
            //1층 : start = k, 2층 : start = k-1
            int t = start;
            while (t <= (n-1) ){
                arr[i][t] = "*";
                t+=k;

            }
            if( (start-1) >= 0){
                start = start-1;
            }else{ //다음 start = -1일 경우
                start = k-1;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
