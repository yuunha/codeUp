package twoDArray.twoD;

import java.util.Scanner;

public class CU_1492 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i]+arr[i-1]; // [1]+[2]->[2'] / [2']+[3]->[3']/ [3']+[4]->[4']
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
