package twoDArray.twoD;

import java.util.Scanner;

public class CU_1499_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int i=0, count=0;
        int max=-1000;
        while(i<n){
            max = Math.max(max,arr[i]);
            count++;
            i++;
            if(count==g||i==n){
                System.out.print(max+" ");
                count=0;
                max=-1000;
            }
        }

        //잘못된 풀이
        // int max =-1000;
        // int i =0, count = 0;
        // while(i<n){
        //     if(i==n-1) { // 마지막
        //         if (n % g != 0) {
        //             max = Math.max(max, arr[i]);
        //             System.out.print(max + " ");
        //             break;
        //         }
        //     }
        //     // g번 반복
        //     if(count<g){
        //         max = Math.max(max,arr[i]);
        //         if(count==g-1){
        //             System.out.print(max+" ");
        //         }
        //         i++;
        //         count++;
        //     }else{
        //         count = 0;
        //         max = -1000;
        //     }
        //
        // }


    }
}
