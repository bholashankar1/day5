package BASIC;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number to check prime or not-:");
        int no=s.nextInt();
        int temp=0;
        for (int i=2;i<=no-1;i++)
        {
            if (no%i==0)
            {
                temp=temp+1;
            }
        }
        if (temp==0)
        {
            System.out.println(no+ " is prime");
        }
        else
        {
            System.out.println(no+ "is not prime");
        }
    }
}

class Primenumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int temp = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(+i);
            }
        }
    }
}







