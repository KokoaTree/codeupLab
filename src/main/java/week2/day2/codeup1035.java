package week2.day2;

import java.util.Scanner;

public class codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexaVal = sc.nextLine();

        int isOcta = Integer.valueOf(hexaVal, 16);

        System.out.printf("%o", isOcta);
    }
}