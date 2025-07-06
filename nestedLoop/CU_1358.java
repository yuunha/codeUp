import java.util.Scanner;

public class CU_1358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //n=7
        int i = n;
        int blank = i/2;
        int star =1;

        while( blank>=0 ){ // 반복 횟수 = n/2+1번
            // 공백 : 3,2,1,0 = ( n/2 )
            for(int j = 1; j <=blank; j++){
                System.out.print(" ");
            }
            blank--;

            // 별 :  1,3,5,7
            for(int j = 1; j <= star; j++){
                System.out.print("*");
            }
            star+=2;
            System.out.println();

        }
    }
}
