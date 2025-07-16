package string;

import java.util.Scanner;

public class CU_1295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.print(Character.toLowerCase(ch));
            }else{
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
}
