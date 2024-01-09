package com.practice.hackerrank.java_static_inicializer_block;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int breadth = sc.nextInt();
        int height = sc.nextInt();
        boolean condition = breadth > 0 && height > 0;
        boolean restrictionBreadth = breadth <= 100 && breadth >= -100;
        boolean restrictionHeight = height <= 100 && height >= -100;

        if (condition && restrictionBreadth && restrictionHeight) {
            int area = breadth * height;
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

}
