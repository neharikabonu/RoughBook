package Topic1;

import java.util.Scanner;

public class P9 {
  void main() {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    int year = input / 365;

    int remainingDays = input % 365;

    int weeks = remainingDays / 7;

    int days = remainingDays % 7;

    IO.println(year + " year(s) " + weeks + " week(s) " + days + " 698day(s)");

    int a = 127;
    byte b = (byte) a;
    System.out.println(b);

    int x = 130;
    byte y = (byte) x;
    System.out.println(y);

  }
}
