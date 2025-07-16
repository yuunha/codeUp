package recursion;

import java.util.Scanner;

public class CU_1902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);

    }
    public static void func(int i){

        System.out.println(i);
        if(i>1){
            func(i-1);
        }
        // func(10) -> func(9) -> ...-> func(2) -> func(1)
    }
}
