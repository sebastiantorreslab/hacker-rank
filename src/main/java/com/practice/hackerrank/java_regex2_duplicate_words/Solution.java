package com.practice.hackerrank.java_regex2_duplicate_words;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String pattern = sc.nextLine();
            if(!pattern.matches("\\d+")){
                System.out.println(repeatedWords(pattern));
            }

        }
        sc.close();
    }


    public static String repeatedWords(String entry) {
        List<String> words = new ArrayList<>();
        Set<String> repeated = new HashSet<>();
        String response = "";
        String[] text = entry.split("\\s+");

        boolean constraint = !entry.isEmpty() && entry.length() <= 100 && !entry.matches("\\d+");

        if (constraint) {
            for (String s : text) {
                if (words.stream().map(String::toLowerCase).anyMatch(w -> w.equals(s.toLowerCase()))) {
                    repeated.add(s);
                } else {
                    words.add(s);
                }
            }
            response = String.join(" ", words);

        }
        return response;
    }
}

