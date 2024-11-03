package gr.aueb.elearn.ch2;
/**
 * Converts Fahrenheit temperature into Celcius
 * in an Integer number.
 *
 *
 * @author AnDagkalakis
 * @version 0.1
 */

import java.util.Scanner;

public class FahrToCelc {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int fahr;
        int celc;


        System.out.println("Please input the temperature in Fahrenheit");

        fahr= in.nextInt();
        celc= 5 *  (fahr - 32) / 9;

        System.out.printf("The temperature in Celcius is %d", celc);

    }
}
