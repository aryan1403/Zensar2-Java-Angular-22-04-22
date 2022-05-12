package Core_Java.Assignment2;

import java.util.Scanner;

public class nearestprime {
    public static boolean isPrime(int num) {
        // 2 - (num-1)
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nearestPrime;
        int n = sc.nextInt();

        if(isPrime(n)) {
            System.out.println("Nearest Prime is the number itself");
        } else {
            // 16
            // 0 - 16 && 16 - ....
            // 13 && 17
            // nearest = 17
            // n - 0
            int smallPrime = -1;
            int bigPrime = -1;

            // 0 - n
            for(int i = n; i > 0; i--) {
                if (isPrime(i)) {
                    smallPrime = i;
                    break;
                }
            }
            int count = n + 1;
            while(true) {
                if(isPrime(count)) {
                    bigPrime = count;
                    break;
                }
                count++;
            }
            // bigPrime - n
            // n - smallPrime
            int steps1 = bigPrime - n;
            int steps2 = n - smallPrime;

            if(steps1 < steps2) {
                nearestPrime = bigPrime;
            } else {
                nearestPrime = smallPrime;
            }
            System.out.println("Nearest Prime number from " + n + " is : " + nearestPrime);
        }
        sc.close();


    }
}
