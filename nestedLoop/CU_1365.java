import java.util.Scanner;

public class CU_1365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        String[][] arr = new String[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = " ";
            }
        }
        for (int i= 1; i < n-1 ; i++) {
            arr[i][i] = "*";
            arr[i][(n-1)-i] = "*";
        }

        for(int i = 0; i < n; i++){
            arr[0][i] = "*";
            arr[n-1][i] = "*";
            arr[i][0] = "*";
            arr[i][n-1] = "*";
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
