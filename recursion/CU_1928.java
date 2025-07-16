package recursion;

import java.util.Scanner;

public class CU_1928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        func(n);
    }
    public static void func(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        if(n%2==0){
            func(n/2);
        }else{
            func(3*n+1);
        }

    }
}
