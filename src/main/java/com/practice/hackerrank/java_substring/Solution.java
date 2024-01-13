package com.practice.hackerrank.java_substring;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        boolean constraint_s = !S.isEmpty() && S.length() <= 100;
        boolean constraint_start_end =  start >= 0 && start < end && end <= S.length();

        if(constraint_s && constraint_start_end){
            separateString(start,end,S);
        }

    }

    public static void separateString(int a, int b, String textString){
        System.out.println(textString.substring(a,b));
    }


}
