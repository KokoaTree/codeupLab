package week2.day2;

import java.util.Scanner;

public class codeup1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String deciVal = sc.nextLine();

        int octaVal = Integer.valueOf(deciVal, 8);
        System.out.printf("%d", octaVal);
    }
}
