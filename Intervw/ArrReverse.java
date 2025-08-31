// package Intervw;

public class ArrReverse {
    public static void main(String[] args) {
        String str = "hello";
        String rev = "";

        // System.out.println(str.charAt(0));

        // int len = str.length();

        for (int i = str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}

