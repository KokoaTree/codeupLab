package week2.day2;

import java.util.Scanner;

public class codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.next().split(":");

        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int second = Integer.parseInt(time[2]);

        System.out.printf("%d", minute);

    }
}
