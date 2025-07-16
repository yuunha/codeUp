package string;

import java.util.Scanner;

public class CU_1407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                //
            }else{
                System.out.print(str.charAt(i));
            }
        }
    }
}
