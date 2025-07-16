package twoDArray.twoD;

import java.util.Scanner;

public class CU_1496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr1 = new int[n/2];
        int k=0;
        int i=0;
        while(i<=n-2){ // 0->2->4...
            if(arr[i]<=arr[i+1]){
                arr1[k]=arr[i];
            }else{
                arr1[k]=arr[i+1];
            }
            k++;
            i=i+2;
        }
        for(int j=0;j<n/2;j++){
            System.out.print(arr1[j]+" ");
        }
    }
}
