import java.util.Scanner;

public class CU_1370 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int r = sc.nextInt();

        for(int t=0;t<r;t++){
            for (int i = 1 ; i <= h; i++) {
                for(int j=1 ; j <= h ; j++){
                    if( i==j ){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int i = (h+1) ; i < 2*h ; i++){
                for(int j = 1 ; j <= h ; j++){
                    if( (i+j)==2*h ){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }
}
