package gr.aueb.elearn.ch2;

import java.util.Scanner;

/**
 * Reforms the numbers the users enters for Day,Month,Year into a Date.
 *
 * @author Andagkalakis
 * @version 0.1
 */

public class Calendar {

    public static void main(String[] args) {

        int day, month, year;

        Scanner in = new Scanner(System.in);

        System.out.println("Please input the current number of day");
        day= in.nextInt();
        System.out.println("Please input the current number of month");
        month= in.nextInt();
        System.out.println("Please input the current number of year");
        year= in.nextInt();

        System.out.printf("The date is %02d/%02d/%04d", day, month,year);


    }
}
