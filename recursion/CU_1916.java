package recursion;

import java.util.Scanner;

public class CU_1916 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 1;
        System.out.println(func(n));
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int func(int i) {
        if(i==1||i==2) return 1;
        if(arr[i]!=0) return arr[i];
        arr[i] = (func(i-1)+func(i-2)) % 10009; // 미리 나누기
        //arr[i-1]+arr[i-2]와 func[i-1]+func[i-2]의 차이 : 재귀적 호출 여부.
        //arr[i-1]+arr[i-2]는 더이상 호출하지 않으므로
        // 인수가1인것부터 시작하지 않는이상 배열을 채울 수 없음
        return arr[i];
    }
    //1, 1, 2, 3, 5, 8,..
}
