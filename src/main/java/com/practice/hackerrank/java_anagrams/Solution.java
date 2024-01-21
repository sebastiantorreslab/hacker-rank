package com.practice.hackerrank.java_anagrams;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.*;

public class Solution {

    static String isAnagram(String a, String b) {

        String pr_a = a.toLowerCase().trim();
        String pr_b = b.toLowerCase().trim();

        boolean frequency = pr_a.length() == pr_b.length();
        boolean constraint = !a.isEmpty() && a.length() <= 50 && !b.isEmpty() && b.length() <= 50;
        boolean response = false;

        if(constraint){
            if(frequency){
                response = letterFrequency(a,b);
            }
        }
        return response ? "Anagrams":"Not Anagrams";
    }


    static boolean letterFrequency(String a, String b){
        // we need to make match with same letters between a and b and the same frequency of these letters.
        String[] letters_a = a.split("(?!^)");
        String[] letters_b = b.split("(?!^)");
        Map<String,Integer> frecuencies_a = new HashMap<>();
        Map<String,Integer> frecuencies_b = new HashMap<>();

        for (int i = 0 ; i < letters_a.length ;i++) {
            int counter_a = 0;
            int counter_b = 0;
            for(int j = 0; j < letters_b.length;j++){

                  if(letters_a[i].equals(letters_b[j])){
                      ++counter_a;
                      frecuencies_a.put(letters_a[i],counter_a);

                  }
                if(letters_b[i].equals(letters_a[j])){
                    ++counter_b;
                    frecuencies_b.put(letters_b[i],counter_b);

                }

            }
        }
      return Arrays.equals(frecuencies_a.values().toArray(), frecuencies_b.values().toArray());
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        System.out.println(isAnagram(a,b));

    }
}
