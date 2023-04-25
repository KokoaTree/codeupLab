package week2.day2;

import java.util.Scanner;

public class codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String idVal = sc.nextLine();

        String[] ID = idVal.split("[-]");

        System.out.printf("%s%s", ID[0], ID[1]);
    }
}
