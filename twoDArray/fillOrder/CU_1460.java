package twoDArray.fillOrder;

import java.util.Scanner;

public class CU_1460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
