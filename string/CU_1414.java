package string;

import java.util.Scanner;

public class CU_1414 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str= s.toUpperCase();

        int count1 = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'C'){
                count1++;
            }
        }
        System.out.println(count1);

        int count2=0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'C'&&str.charAt(i+1) == 'C'){
                count2++;
            }
        }
        System.out.println(count2);
    }
}
