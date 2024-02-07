package com.practice.hackerrank.java_regex;

import java.util.Scanner;

public class Solution {

//Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String pattern = sc.next();
            System.out.println(MyRegex.processString(pattern));
        }
    }

    private static class MyRegex {
        private static boolean processString(String entry) {
            String regex = "\\.";
            String[] expression = entry.split(regex);
            boolean restriction = expression.length == 4;
            boolean response = false;

            if (restriction) {
                try {
                    for (String s : expression) {
                        boolean constraint = s.length() <= 3;
                        if (constraint) {
                            int num = Integer.parseInt(s);
                            response = num >= 0 && num <= 255;
                        }
                    }
                } catch (Exception e) {
                    return response;
                }
            }
            return response;
        }
    }

}
