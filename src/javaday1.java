/*
write a method which returns a day of the week in String.
A method having parameters like Month,Date,Year using these parameters need to find out a day of the week.

Example:
month=8
day=14
year=2017

Output: MONDAY
*/

import java.time.Month;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class javaday1 {

    public static void main(String[] args) {

        String day = getDay(8,14,2017);
        System.out.println("Day & Month Name: " + day);

    }

    public static String getDay(int month, int day, int year){

        LocalDate date = LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String monthName = Month.of(month).name();


        return dayOfWeek.toString() + " " + monthName;
    }


}



