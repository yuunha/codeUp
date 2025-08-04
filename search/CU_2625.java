package search;

import java.util.Scanner;

public class CU_2625 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); // 화단의 총 길이

        //ex) 9=4+(4+1)=4+(3+2)=3+(3+3) -> 숫자가 큰 순서대로 나열
        // 가장 큰 변의 길이는 4 (나머지 두변의 길이의 합보다 작아야함)

        //변의 길이 : a>=b>=c
        int a=0,b=0,c=0;
        int count=0;
        int max=0,min=0;
        //가장 큰 a 구하기
        if(len%2==0){ //Len : 짝수
            max=len/2-1;
        }else{        //len : 홀수
            max=len/2;
        }
        //가장 작은 a 구하기
        if(len%3==0){
            min = len/3;
        }else{
            min = len/3+1;
        }
        for(int i=min;i<=max;i++){
            a=i;
            b=a; // 9=4+4+1, 8=3+3+2
            c=len-a-b;
            count++;
            while(b-1>=c+1){
                b=b-1;
                c=c+1;
                count++;
            }
        }

        System.out.println(count); // 만들 수 있는 화단의 수
    }
}
