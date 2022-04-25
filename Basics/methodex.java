package Basics;

public class methodex {
    public static void add(int a, int b) {
        System.out.println("Sum of (" + a + ", " + b + ") = " + (a + b));
    }
    public static boolean even(int n) {
        if(n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        add(5, 4);
        add(10, 20);
        System.out.println(even(22));
    }
}
