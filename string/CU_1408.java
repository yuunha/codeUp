package string;

import java.util.Scanner;

public class CU_1408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        char[] str1 = new char[len];
        char[] str2 = new char[len];
        for (int i = 0; i < str.length(); i++) {
            int ch_ascii = str.charAt(i);
            int ch_ascii_1 = ch_ascii + 2;
            str1[i] = (char)ch_ascii_1;
            int ch_ascii_2 = (ch_ascii*7) % 80 + 48;
            str2[i] = (char)ch_ascii_2;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(str1[i]);
        }
        System.out.println();
        for (int i = 0; i < len; i++) {
            System.out.print(str2[i]);
        }
    }
}
