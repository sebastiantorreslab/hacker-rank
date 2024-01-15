package com.practice.hackerrank.java_string_reverse;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String lower_a = A.toLowerCase();

        boolean constraint = A.length() <= 50 && !A.isEmpty() && !lower_a.isEmpty();

        if(constraint){

            List<String> list = new ArrayList<>();
            list.add(lower_a);
            System.out.println(lower_a.strip());

            if(reverseList(list).trim().equals(lower_a.trim())){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static String reverseList(List<String> list){

        List<String>  reverse_list = new ArrayList<>();

        String text_in = list.get(0);
        int counter = text_in.length()-1;
        String rev_string;

        try{

            while(counter >=0){
                String value = String.valueOf(text_in.charAt(counter));
                reverse_list.add(value);
                counter--;
            }

        } catch (Exception e){
            e.getCause();
        }finally {
            rev_string = String.join("", reverse_list);
        }
        return  rev_string;
    }
}
