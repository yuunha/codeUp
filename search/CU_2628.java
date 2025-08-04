package search;

import java.util.Scanner;

public class CU_2628 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a<b){
            if( a<c && a<d && c<b && d<b){
                System.out.println("not cross");
            }else if( (c<a||c>b) && (d<a||d>b) ){
                System.out.println("not cross");
            }else{
                System.out.println("cross");
            }
        }else{
            if( c>b && c<a && d>b && d<a ){
                System.out.println("not cross");
            }else if( (c>a||c<b) && (d>a||d<b) ){
                System.out.println("not cross");
            }else{
                System.out.println("cross");
            }
        }
    }
}
