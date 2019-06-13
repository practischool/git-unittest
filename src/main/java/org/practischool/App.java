package org.practischool;

/**
 * Hello world!
 */
public class App {
    public static int triangleNumber(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n + triangleNumber(n - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
