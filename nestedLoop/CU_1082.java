import java.util.Scanner;

public class CU_1082 {
    //입력 : 16진수로 한 자리 수.
        // 단, A ~ F 까지
    // 출력 : 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력
        // 16진수로 출력해야 한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // A
        int int_s = Integer.valueOf(s,16); // string -> int
        //System.out.println(int_s); //10진수 출력

        for( int i=1; i<=15 ;i++){
            int result = i * int_s; // i * 10(A) => int*int = int

            String result_string = Integer.toHexString(result).toUpperCase();  // int -> 16진수 문자열
            String b = Integer.toHexString(i).toUpperCase().toUpperCase();
            System.out.println(s+"*"+b+"="+result_string);
        }
    }
}
// 170 -> 8진수 : 64+56 = 120