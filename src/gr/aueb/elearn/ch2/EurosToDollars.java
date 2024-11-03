package gr.aueb.elearn.ch2;

//import java.util.Scanner;

import java.util.Scanner;

/**
 * Converts Euros to US Dollars by value.
 *
 * @author AnDagkalakis
 * @see EurosToDollars
 * @version 0.2
 *
 */

public class EurosToDollars     {


    public static void main(String[] args) {

        //Declaration of Variables
        int Euros,  centUS, USD, remainingCents;
        final int Eur_USD = 109;


        Scanner in = new Scanner(System.in);

        System.out.println("Please give the ammount of Euros you want to transform into US Dollars");
        Euros = in.nextInt();
        centUS = Euros * Eur_USD;

        USD = centUS / 100; //With div we get upper class numbers
        remainingCents = centUS % 100; //With mod we get 2 lower class numbers

        System.out.printf("Total US cents: %02d\n", centUS);
        System.out.printf("USD: %d\nUSCents: %02d\n", USD, remainingCents);
        in.close();


    }
}
