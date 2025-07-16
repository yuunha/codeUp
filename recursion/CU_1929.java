package recursion;

import java.util.Scanner;

public class CU_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        func(n);
    }
    public static void func(int n) {
        if(n==1) { //n=1이 되면 더 이상 재귀호출 안함.
            System.out.println(n);
        }else if(n%2==0){
            func(n/2);
            System.out.println(n);
        }else {
            func(3*n+1);
            System.out.println(n);
        }
    }
}
