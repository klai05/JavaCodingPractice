package com.example.javacodingpractice;


/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.
 *******************************************************************************/

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //checkPrime (1);
        checkPrime(3);
        checkPrime(100);
        checkPrime(53);
    }

    public static void checkPrime(int n) {
        int i, m, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        }
        else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }                //end of else
    }


}
