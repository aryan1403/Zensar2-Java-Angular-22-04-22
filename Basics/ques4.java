package Basics;

public class ques4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 9, -6, - 1, 4, 5};

        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        System.out.println("Product = " + product);
    }
}