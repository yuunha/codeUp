package twoDArray.twoD;

import java.util.ArrayList;
import java.util.Scanner;

public class CU_1499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = sc.nextInt();
        //g*m묶음 <= n
        int m;
        if(n%g==0){
            m=n/g;
        }else{
            m=n/g+1;
        }
        int[][] arr1 = new int[m][g];

        //[0]+[1]+[2]
        int count=0;
        for(int i=0;i<m;i++){ // m개의 묶음
            for(int j=0;j<g;j++){ // 1묶음 = g개 숫자
                if(count<n){
                    arr1[i][j]= sc.nextInt();
                    count++;
                }
            }
        }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<g;j++){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int count1=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<g;j++){
                if(count1<n){
                    arr1[i][0]=Math.max(arr1[i][0],arr1[i][j]);
                    count1++;
                }
            }
        }
        for(int i=0;i<m;i++){
            System.out.print(arr1[i][0]+" ");
        }
    }
}
