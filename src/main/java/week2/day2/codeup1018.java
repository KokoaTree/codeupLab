package week2.day2;

import java.util.Scanner;

public class codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] isTime = time.split(":");

        int hour = Integer.parseInt(isTime[0]);
        int minute = Integer.parseInt(isTime[1]);

        System.out.printf("%d:%d", hour, minute);

    }

}
