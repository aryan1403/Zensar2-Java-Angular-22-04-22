package Basics;

import java.util.Scanner;

public class ques5 {
    public static double inputMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        double marks = (double) sc.nextDouble();
        // sc.close();
        return marks;
    }
    public static void main(String[] args) {
        double[] marks = new double[10];
        for (int i = 0; i < 10; i++) {
            marks[i] = inputMarks();
        }

        // Greatest Marks
        double greatest = marks[0];
        for (double m : marks) {
            if(m > greatest) {
                greatest = m;
            }
        }

        // Lowest marks
        double smallest = marks[0];
        for (double m : marks) {
            if(m < smallest) {
                smallest = m;
            }
        }

        // Average
        // formula = sum of all elements/ no. of elements

        int average = 0;

        for (double d : marks) {
            average += d;
        }
        average /= marks.length;

        System.out.println("Greatest = " + greatest);
        System.out.println("Smallest = " + smallest);
        System.out.println("Average = " + average);
    }
}
