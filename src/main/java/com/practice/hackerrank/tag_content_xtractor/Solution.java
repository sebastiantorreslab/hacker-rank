package com.practice.hackerrank.tag_content_xtractor;


import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        // tag content extractor
        validateTags("<h1>Nayeem loves counseling</h1>");


    }

    public static String validateTags(String entry) {
        int a = entry.indexOf("<");
        int b = entry.indexOf(">");
        int c = entry.lastIndexOf("<");
        int d = entry.lastIndexOf(">");
        int symbol = c + 1;
        String response = "";


            Stack<String> tags = new Stack<>();
            String s = entry.substring(a + 1, b);
            String z = entry.substring(c + 2, d);

            tags.push(s);

            for (int i = 0; i < tags.size(); i++) {
                if (!Integer.toString(symbol).isEmpty()) {
                    if (tags.contains(z)) {
                        tags.pop();
                    }
                }
                if (tags.isEmpty()) {
                    response = entry.substring(b + 1, c - 1);
                    System.out.println(response);
                }

            }
        return response;
    }

}
