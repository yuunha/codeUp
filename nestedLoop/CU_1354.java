import java.util.Scanner;

public class CU_1354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) { // i = 5~1
            for(int j = 1; j<=i; j++) { //j = 1~i
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
