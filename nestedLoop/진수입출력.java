public class 진수입출력 {
    public static void main(String[] args) {
        //16진수 입력받기!!
        //2025.7.7
        //Integer.valueOf(s,radix)

        // //System.out.println(Integer.valueOf("0x11", 16)); //오류! -> Integer.valueOf(s,radix)는 순수한 s만 받음
        // int num = Integer.valueOf("11", 16); // 입력으로 16진수 11을 받는다.
        // System.out.println("10진수: "+ num); // 10진수로 출력
        // System.out.println("16진수: " + Integer.toHexString(num)); // 16진수로 출력
        //
        // int hex_num = 0x11; //16진수 숫자를 저장
        // System.out.println("---------\n"+"String: " + "0x11");
        // System.out.println("10진수: " + hex_num); // 10진수로 출력
        // System.out.println("2진수: "+ Integer.toBinaryString(hex_num)); // 2진수로 출력
        // System.out.println("16진수: " + Integer.toHexString(hex_num)); // 16진수로 출력
        //
        // // parseInt : 기본형int 리턴. valueOf와 같은 역할
        // System.out.println(Integer.parseInt("11",16)); // 입력으로 16진수 11을 받는다.

        //복습(2025.7.6)
        int a = 0x11; // 11(16진수) = 17(10진수)
        System.out.println("(1) "+ a);
        System.out.println("(2) "+ Integer.valueOf(a));
        System.out.println("(3) "+ Integer.toHexString(a));
        String aa = "12";
        System.out.println("(4) "+ Integer.valueOf(aa,16));
        System.out.println("(5) "+ Integer.toHexString(12));
        System.out.println("(6) "+ Integer.valueOf("c",16)); //입력으로 16진수c를 받는다
        //parseInt
        System.out.println("(7) "+ Integer.parseInt("11")); //입력으로 String 11을 받는다.
        System.out.println("(8) "+ Integer.parseInt("b",16)); //입력으로 16진수 b(String)를 받는다
    }
}
