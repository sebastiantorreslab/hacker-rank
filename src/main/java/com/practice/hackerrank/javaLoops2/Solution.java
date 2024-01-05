package com.practice.hackerrank.javaLoops2;

import java.util.Scanner;

public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int principal = (int) (a + ((Math.pow(2,0)) * b));

            for(int j=1;j<=n;j++){
                if(j>=2){
                    int added = (int) ((Math.pow(2,j-1)) * b);
                    principal += added;
                }
                if(j==n){
                    System.out.print(principal + " " + "\n");
                }else{
                    System.out.print(principal + " ");
                }

            }

        }
        in.close();
    }
}

