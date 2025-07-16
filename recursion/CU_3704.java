package recursion;

import java.util.Scanner;

public class CU_3704 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];

        System.out.println(func1(n));
        //여기서 func1(n)%1000하면 안되는 이유: 미리미리 모듈러 연산을 하지 않으면 숫자가
        //너무 커져서 오버플로우 또는 손실이 되서 오류 생갈 수 있음.
    }

    public static int func1(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else if(n==3){
            return 4;
        }
        if(arr[n]!=0){
            return arr[n];
        }

        arr[n]=(func1(n-1)+func1(n-2)+func1(n-3))%1000;
        return arr[n];
    }
}
