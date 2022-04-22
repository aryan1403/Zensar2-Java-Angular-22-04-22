package Basics;

public class evenOdd {
    public static void main(String[] args) {
        int n = 31;

        // n % 2 == 0 (even)
        // n % 2 not = 0 (odd)

        if(n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}
