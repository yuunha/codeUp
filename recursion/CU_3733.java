package recursion;

import java.util.Scanner;

public class CU_3733 {
    static int count=0;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        arr = new int[10000001];
        int max=0;
        int max_count=0;
        for(int i=a;i<=b;i++){
            if(func(i)>max){
                max=i;
                max_count=func(i);
            }
        }
        System.out.println(max+" "+max_count);

    }
    // private static int func(int i){
    //     if(i==1){
    //         return 1;
    //     }else if(i%2==0){
    //         return 1+func(i/2);
    //     }else{
    //         return 1+func(i*3+1);
    //     }
    //
    // }
    private static int func(long i) {
        if (i == 1) return 1;

        // 이미 계산된 값 있으면 리턴 (단, i가 배열 범위 내일 때만)
        if (i < arr.length && arr[(int)i] != 0) {
            return arr[(int)i];
        }

        int result;
        if (i % 2 == 0) {
            result = 1 + func(i / 2);
        } else {
            result = 1 + func(i * 3 + 1);
        }

        // 결과 저장 (배열 범위 내일 때만)
        if (i < arr.length) {
            arr[(int)i] = result;
        }

        return result;
    }
}
