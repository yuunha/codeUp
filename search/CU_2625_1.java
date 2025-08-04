package search;

import java.util.Scanner;

public class CU_2625_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); // 화단의 총 길이

        //ex) 9=4+(4+1)=4+(3+2)=3+(3+3) -> 숫자가 큰 순서대로 나열
        // 가장 큰 변의 길이는 4 (나머지 두변의 길이의 합보다 작아야함)

        int count = 0;
        for(int i=1;i<len;i++){
            for(int j=1;j<=i;j++){
                for(int k=1;k<=j;k++){
                    if(j+k>i&&i+j+k==len){
                        count++;
                    }
                }
            }
        }
        System.out.println(count); // 만들 수 있는 화단의 수
    }
}
