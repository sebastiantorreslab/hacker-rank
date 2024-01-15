package com.practice.hackerrank.java_substring_comparisions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Solution {


    public static String getSmallestAndLargest(String s, int k)  throws IndexOutOfBoundsException {

        String smallest = "";
        String largest = "";

        boolean constraint = !s.isEmpty() && s.length() <= 1000;
        //boolean constraint_match = s.matches("[a-zA-Z]");

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        if(constraint) {

            int beginIndex = 0;
            int counter = 0;
            int endIndex;
            List<String> subList = new ArrayList<>();

            try{

                while(counter < s.length()) {

                    endIndex = beginIndex + k;
                    String string_sub = s.substring(beginIndex, endIndex);
                    subList.add(string_sub);
                    subList.sort((o1, o2) -> o1.compareTo(o2));
                    beginIndex = ++counter;

                }
            } catch(Exception e) {

            }finally{
                smallest = subList.get(0);
                largest = subList.get(subList.size() -1);
            }

        }

        return smallest + "\n" + largest;
    }

//    public static String compareToSmallestAndLargest(List<String> substringList){
//
//        int counter = 0;
//        int comparation;
//
//           for(int i = 0; i < substringList.size(); i++){
//
//                   String a = substringList.get(counter);
//                   String b = substringList.get(i);
//
//
//                  comparation = a.compareToIgnoreCase(b);
//
//                  if(comparation > 0){
//                      largest = a;
//                      smallest = b;
//                  }else{
//                      largest = b;
//                  }
//
//               counter++;
//
//           }
//
//       return smallest + "\n" + largest;
//
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }


}
