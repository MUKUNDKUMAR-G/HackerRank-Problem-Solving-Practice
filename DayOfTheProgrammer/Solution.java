/*
 Marie invented a [Time Machine](https://en.wikipedia.org/wiki/Time_machine) and wants to test it by time-traveling to visit Russia on the [Day of the Programmer](https://en.wikipedia.org/wiki/Day_of_the_Programmer) (the 256th day of the year) during a year in the inclusive range from 1700 to 2700.

From 1700 to 1917, Russia's official calendar was the [Julian calendar](https://en.wikipedia.org/wiki/Julian_calendar); since 1919 they used the [Gregorian calendar](https://en.wikipedia.org/wiki/Gregorian_calendar) system. The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day after January 31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.

In both calendar systems, February is the only month with a variable amount of days; it has 29 days during a leap year, and 28 days during all other years. In the Julian calendar, leap years are divisible by 4; in the Gregorian calendar, leap years are either of the following:

- Divisible by 400.
- Divisible by 4 and not divisible by 100.

Given a year, `y`, find the date of the 256th day of that year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is y.

For example, the given `year = 1984`. 1984 is divisible by 4, so it is a leap year. The 256th day of a leap year after 1918 is September 12, so the answer is `12.09.1984`.
 */

 import java.util.Scanner;

 public class Solution {
 
     public static void main(String[] args) {
         // Initialize Scanner to read input
         Scanner input = new Scanner(System.in);
         
         // Take the year as input
         int year = input.nextInt();
         
         // Create an instance of Result class to call the method
         Result result = new Result();
         
         // Call the method dayOfProgrammer and print the result
         String dayOfProgrammer = result.dayOfProgrammer(year);
         System.out.println("Result is: " + dayOfProgrammer);
 
         // Close the scanner to avoid memory leaks
         input.close();
     }
 }
 
 // Define the Result class with the logic for dayOfProgrammer
 class Result {
 
     // Method to return the Day of the Programmer for the given year
     public String dayOfProgrammer(int year) {
         // Add the logic for calculating "Day of the Programmer" based on the year
         if (year == 1918) {
             return "26.09.1918";  // Transition year in Russia
         } else if (year < 1918 && year % 4 == 0) {
             return "12.09." + year;  // Julian leap year
         } else if (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
             return "12.09." + year;  // Gregorian leap year
         } else {
             return "13.09." + year;  // Non-leap year
         }
     }
 }
     