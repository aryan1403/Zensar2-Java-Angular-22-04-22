package Basics;

public class loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 1;
        int num = 5;
        while(i <= 10) {
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;
        }
        int j = 1;
        do {
            System.out.println(num + " x " + j + " = " + (num*j));
            j++;
        } while(j >= 10); // false
    }
}
