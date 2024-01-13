package com.practice.hackerrank.java_string_introduction;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */

        sumlenght(A, B);
        stringComparer(A, B);
        upperCharString(A,B);

    }

    public static void sumlenght(String a, String b){

        int a_length = a.length();
        int b_length = b.length();

        if(a_length > 0 && b_length > 0 ){
            int result = a_length + b_length;
            System.out.println(result);
        }
    }

    public static void stringComparer(String a, String b){

        int comparation = a.compareToIgnoreCase(b);

        if(comparation > 0 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    public static void upperCharString(String a, String b){

        String regex = "^[a-z]";
        char char_a = Character.toUpperCase(a.charAt(0));
        char char_b = Character.toUpperCase(b.charAt(0));

        String a_toUpper = Character.toString(char_a);
        String b_toUpper = Character.toString(char_b);

        String upper_a = a.replaceFirst(regex, a_toUpper);
        String upper_b = b.replaceFirst(regex, b_toUpper);

        System.out.println(upper_a + " " +  upper_b);


    }
}
