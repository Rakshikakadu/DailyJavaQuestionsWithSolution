
/*
You have given number which is payment of any country you have write that payment in various
country's currency format.
e.g: 1234.56
In US you can write this transactional number in below format
 $1,234.56

 Same you have to convert in different countries payment format like INDIA, CHINA, France for that you can use
 Locale class
*/

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class javaday2 {

    public static void main(String[] args) {

        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        Locale indianLocale = new Locale("en","IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indianLocale);

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("China currency : " + china.format(payment));
        System.out.println("france currency : " + france.format(payment));
        System.out.println("india currency : " + india.format(payment));
        System.out.println("US currency : " + us.format(payment));



    }
}
