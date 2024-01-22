package com.practice.hackerrank.java_string_tokens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        stringTokens(s);
        sc.close();
    }

    public static void stringTokens(String s) {
        String ss = s.trim();
        boolean constraint = !s.isEmpty() && s.length() <= (4 * Math.pow(10, 5));
        String[] tokens = ss.split("[^A-Za-z]+");

        Pattern pattern = Pattern.compile("^\\s*$");
        Pattern pattern1 = Pattern.compile("\\s*[A-Za-z]*\\s*");
        Matcher matcher = pattern.matcher(ss);
        Matcher matcher1 = pattern1.matcher(s);

        if (constraint && !matcher.matches()) {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
        else if(constraint && matcher1.matches() && !matcher.matches()) {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
            else if(constraint && matcher.matches())  {
                System.out.println(0);
            }



        }
    }


