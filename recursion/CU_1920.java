package recursion;

import java.util.Scanner;

public class CU_1920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
        }else{
            System.out.print(1); //n=0인 경우 성립X
            func(n);
        }

    }
    public static void func(int n) {
        if(n==1) return; //더 이상 나눌 수 없음.
        func(n/2);
        System.out.print(n%2);
    }
}
