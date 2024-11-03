package gr.aueb.elearn.ch2;


import java.util.Scanner;

/**
 * Transforms the total ammount of seconds that the user gives to
 * Days, Hours, Minutes and remaining Seconds
 *
 * @author BITER
 * @version 0.1
 */
public class TimeToDHMS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int SEC_PER_DAY = 24*3600;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;
        long remainingSecs, days, hours, mins;


        System.out.println("Please give the ammount of seconds to transform into Days,Hours,Minutes and Seconds:");
        remainingSecs = in.nextLong();


        days = remainingSecs / SEC_PER_DAY;
        remainingSecs = remainingSecs % SEC_PER_DAY;

        hours = remainingSecs / SEC_PER_HOUR;
        remainingSecs = remainingSecs % SEC_PER_HOUR;

        mins = remainingSecs / SEC_PER_MIN;
        remainingSecs = remainingSecs % SEC_PER_MIN;

        System.out.printf("DAYS: %d\t HOURS: %d\tMINUTES: %d\t SECONDS: %d",
                days, hours, mins, remainingSecs);

    }
}
