import java.util.Scanner;

public class CU_1368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int k = sc.nextInt();
        String rl = sc.next();



        if(rl.equals("L")){
            int blank_num_l = 0;

            for(int i = 0; i < h; i++){
                for(int j = 0; j< blank_num_l; j++){
                    System.out.print(" ");
                }
                blank_num_l++;
                for (int j = 0; j < k; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if(rl.equals("R")){
            int blank_num_r=h-1;
            for(int i = 0; i < h; i++){
                for(int j = 0; j< blank_num_r; j++){
                    System.out.print(" ");
                }
                blank_num_r--;
                for (int j = 0; j < k; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    }
}
