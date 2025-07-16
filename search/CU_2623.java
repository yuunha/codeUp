package search;

import java.util.Scanner;

public class CU_2623 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.max(a,b);
        int max=0;

        for(int i=1; i<=c; i++){
            if(a%i==0&&b%i==0){//a,b의 공약수
                max=i;
            }
        }
        System.out.println(max);
    }
}
