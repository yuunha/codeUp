import java.util.Scanner;

public class CU_1371 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n; i++) {
            for (int j = 1; j <= 2*n; j++) {
                if((i+j)==(n+1)|| (i+j)==(3*n+1) || i == j+n || i ==(j-n)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
