package SalleCinema;

import java.util.Scanner;

/**
 * Created by capetrel on 26/04/2016.
 */
public class Saisie {

    private static Scanner scanner = new Scanner(System.in);

    public static String saisirLine(String message)   {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static int saisirplace(String message)   {
        System.out.println(message);
        int i = scanner.nextInt();
        scanner.nextLine();
        return i;
    }

    public static double saisirPrix(String message)   {
        System.out.println(message);
        double j = scanner.nextDouble();
        scanner.nextLine();
        return j;

    }

    public static boolean saisirReduction(String message)   {
        System.out.println(message);
        boolean k = scanner.nextBoolean();
        scanner.nextLine();
        return k;

    }



}
