package nestedLoop;

import java.util.Scanner;

public class CU_1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int blank=0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < blank; j++) { // blank = 0~4
                System.out.print(" ");
            }
            blank++;
            System.out.println("**");
        }
    }
}
