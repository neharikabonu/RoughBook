package Topic4;

import java.util.Scanner;

public class P3 {
  void main() {
    Scanner sc = new Scanner(System.in);
    int fact = 1;
    int num = sc.nextInt();

    if (num == 1 || num == 0) {
      IO.println(fact);
      return;
    }

    for (int i = 2; i <= num; i++) {
      fact = fact * i;
    }
    IO.println(fact);
  }
}
