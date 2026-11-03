package Topic1;

import java.util.Scanner;

public class P8 {
  void main() {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    int hours = input / 60;
    int minutes = input % 60;

    IO.println(hours +" hours " + minutes + " minutes.");
  }
}
