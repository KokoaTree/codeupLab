package week2.day2;

import java.util.Scanner;

public class codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("[.]");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
