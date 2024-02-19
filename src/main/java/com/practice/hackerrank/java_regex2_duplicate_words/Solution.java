package com.practice.hackerrank.java_regex2_duplicate_words;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    /*
     In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word. For example, the words love and to are repeated in the sentence I love Love to To tO code. Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         while(sc.hasNextLine()){
             String sentence = sc.next();
             repeatedWord(sentence);
         }

    }


    public static void repeatedWord(String entry){
        String regex =  "\\b(\\w+)(\\s+\\1\\b)+";
        String[] sentence = entry.split(regex);
        System.out.println(Arrays.toString(sentence));
    }












}
