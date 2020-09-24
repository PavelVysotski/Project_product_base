package util;

import java.util.Scanner;

public class CommandReader {

    private static final Scanner scan = new Scanner(System.in);

    public static String readString(String message) {
        System.out.print(message);
        return scan.nextLine();
    }

    public static int readNumber(String message) {
        System.out.print(message);
        return Integer.parseInt(scan.nextLine());
    }

    public static double readDouble(String message) {
        System.out.print(message);
        return Double.parseDouble(scan.nextLine());
    }

    public static long readLong(String message) {
        System.out.print(message);
        return Long.parseLong(scan.nextLine());
    }
}
