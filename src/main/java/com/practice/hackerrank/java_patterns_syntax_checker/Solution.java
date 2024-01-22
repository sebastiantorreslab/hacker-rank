package com.practice.hackerrank.java_patterns_syntax_checker;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while(testCases>0) {

            try {

                String pattern = sc.nextLine();
                Pattern pattern1 = Pattern.compile(pattern);

                if (!pattern1.pattern().isEmpty())
                    System.out.println("Valid");

            } catch (PatternSyntaxException ps) {
                System.out.println("Invalid");
            } finally{
                testCases--;
            }

        }


        }


    }


