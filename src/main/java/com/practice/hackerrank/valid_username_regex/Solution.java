package com.practice.hackerrank.valid_username_regex;

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
        System.out.println(usernameValidator("Samantha"));
    }

    public static boolean usernameValidator(String entry){
        boolean constraint = !entry.isEmpty() && entry.length() < 100;

        String regex = "^[A-Za-z]{8,30}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(entry);




        return matcher.matches();
    }


}
