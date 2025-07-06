import java.util.Scanner;

public class CU_1355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >=1; i--) { // i: 5~1
            for(int j = 1; j <= (n-i); j++) { // j =  X -> (1~1) -> (1~2)->...->(1~4)
                System.out.print(" ");
            }
            for(int j = i; j >=1; j--) { // j = (5~1) -> (5~2) -> ....(5~5)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
