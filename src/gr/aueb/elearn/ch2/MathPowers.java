package gr.aueb.elearn.ch2;

import java.util.Scanner;

/**
 * Calculates the cubiq and square powers of a number
 * that the User inputs. This programm uses the method of
 * Math.pow() of the class Math.For system purposes it only uses
 * integer numbers.
 *
 * @author AnDagkalakis
 * @version 0.2
 */
public class MathPowers {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num;

        System.out.println("Please give a number to calculate");
        num= in.nextInt();

        System.out.printf("Number:\t%d\nSquare:\t%d\nCube:\t%d", num, (int)Math.pow(num, 2), (int)Math.pow(num, 3));


    }
}
