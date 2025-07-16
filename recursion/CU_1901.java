package recursion;

import java.util.Scanner;

public class CU_1901 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(1,n);

    }
    public static void func(int i,int n) {
        System.out.println(i);
        if(i<n){
            func(i+1,n);
        }

    }
}
