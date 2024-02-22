package com.practice.hackerrank.valid_username_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {


    /*
     username policy on your company internal networking platform

     a username is valid if:
     * The username consists of  to  characters inclusive.
     * If the username consists of less than or greater than  characters,
     * then it is an invalid username.

     * The username can only contain alphanumeric characters and underscores (_).
     * Alphanumeric characters describe the character
     * set consisting of lowercase characters ,uppercase characters , and digits .

     * The first character of the username must be an alphabetic character, i.e.,
       either lowercase character  or uppercase character
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            if (!text.matches("\\d+")) {
                System.out.println(usernameValidator(text));
            }

        }
        sc.close();
    }

    public static String usernameValidator(String entry) {
        boolean constraint = !entry.isEmpty() && entry.trim().length() < 100;
        Matcher matcher = null;
        String response = "";

        if (constraint) {
            String regex = "^[A-Za-z]([A-Za-z0-9_]){7,29}$";
            Pattern pattern = Pattern.compile(regex);
            matcher = pattern.matcher(entry);
        }else{
            response = "Invalid";
        }
        if (matcher != null) {
            response = matcher.matches() ? "Valid" : "Invalid";
        }
        return response;
    }


}
