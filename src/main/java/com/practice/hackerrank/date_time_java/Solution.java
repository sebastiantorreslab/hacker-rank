package com.practice.hackerrank.date_time_java;

import java.text.*;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class Solution {
    public static void main(String[] args) throws ParseException {

//             * Complete the 'findDay' function below.
//             *
//             * The function is expected to return a STRING.
//             * The function accepts following parameters:
//             *  1. INTEGER month
//              *  2. INTEGER day
//             *  3. INTEGER year

        System.out.println(findDay(8, 5, 2015));
//
    }
    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        String output = null;
        boolean restriction = year > 2000 && year < 3000;
        int base = 1900;

        Date date = new Date(year-base,month-1,day);

        if (restriction) {
            calendar.clear();
            calendar.setFirstDayOfWeek(SUNDAY);

            calendar.setTime(date);

            switch (calendar.get(DAY_OF_WEEK)) {
                case SUNDAY    -> output = "SUNDAY";
                case MONDAY    -> output = "MONDAY";
                case TUESDAY   -> output = "TUESDAY";
                case WEDNESDAY -> output = "WEDNESDAY";
                case THURSDAY  -> output = "THURSDAY";
                case FRIDAY    -> output = "FRIDAY";
                case SATURDAY  -> output = "SATURDAY";

            }

        }
        return output;
    }




}
