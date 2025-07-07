package nestedLoop;

import java.util.Scanner;

public class CU_1380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=7){
            for (int i = 1; i < n; i++) { //1~(n-1)
                System.out.print( i + " " + (n-i) );
                System.out.println();
            }
        }else{ // n=8,9,..12
            for (int i = n-6 ; i <=6; i++) {
                System.out.print( i + " " + (n-i) );
                System.out.println();
            }
        }


    }
}
