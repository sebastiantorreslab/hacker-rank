package com.practice.hackerrank.end_of_file;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int sequence = 0;

        while(sc.hasNextLine()){
            String input = sc.nextLine();

            if(input.contains("end-of-file")){
                System.out.println(++sequence + " " + input );
                break;
            }

            System.out.println(++sequence + " " + input);

        }


    }
}
