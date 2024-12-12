package gr.aueb.cf.ch10;

import java.util.*;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int power = 0;
        int digit = 0;
        int number = in.nextInt();
        int temp = number;
        int sum = 0;
        //int digitCount = 0;

        do {
            //++digitCount;
            digit = number % 10;
            digits.add(digit);
            number /= 10;
        } while (number != 0);

        Collections.reverse(digits);

        for (int i : digits) {
            sum += (int) Math.pow(i, power);
        }

        System.out.printf("%d is " + ((sum == temp) ? " ": "not ") + "an Armstrong number.", temp);

    }
}
