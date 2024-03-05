package com.kn.recursionss;

public class Recurs2 {
    static int count = 0;

    public static void main(String[] args) {
        int n = 3;
        int result = fact(n);
        System.out.println(result);
        System.out.println(count);
    }

    static int fact(int n) {
        count++;
        System.out.println(count);

        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }
}
