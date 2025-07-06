import java.util.Scanner;

public class CU_1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int blank_num = n-1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < blank_num; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            blank_num--;
            System.out.println();
        }
    }
}
