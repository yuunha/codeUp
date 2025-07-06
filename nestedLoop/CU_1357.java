import java.util.Scanner;

public class CU_1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) { // i = 1~4
            for(int j = 1; j <= i; j++) { // j = (1) > (1~2) > (1~3) >...
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i >=1 ; i--) { //i = 3~1
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
