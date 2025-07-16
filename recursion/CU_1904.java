package recursion;

import java.util.Scanner;

public class CU_1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        func(a,b);
    }
    public static void func(int i, int b) {
        if(i<=b){
            if(i%2==1){
                System.out.print(i+" ");

            }
            func(i+1,b);

        }
    }
}
