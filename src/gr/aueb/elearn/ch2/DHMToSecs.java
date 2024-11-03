package gr.aueb.elearn.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Converts Days, Hours, Minutes and Seconds into Seconds.
 *
 * @author AnDagkalakis
 * @version 0.2
 */

public class DHMToSecs {

    public static void main(String[] args) {

        final int SEC_PER_DAY= 3600 * 24;
        final int SEC_PER_HOUR= 3600;
        final int SEC_PER_MINUTE= 60;

        Scanner in = new Scanner(System.in);
        long days, hours, mins, secs, totalSec;

        System.out.println("Please give the ammount of Days");
        days= in.nextLong();
        System.out.println("Please give the ammount of Hours");
        hours= in.nextLong();
        System.out.println("Please give the ammount of Minutes");
        mins= in.nextLong();
        System.out.println("Please give the ammount of Seconds");
        secs= in.nextLong();

        totalSec = (days * SEC_PER_DAY) + (hours * SEC_PER_HOUR) + (mins * SEC_PER_MINUTE) + secs;

        System.out.printf(Locale.US,"The total ammount of seconds is: %,d", totalSec);

        in.close();
    }
}
