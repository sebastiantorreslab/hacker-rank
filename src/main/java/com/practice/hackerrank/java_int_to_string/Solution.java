package com.practice.hackerrank.java_int_to_string;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();

            String s = Integer.toString(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

