package Topic4;

import java.util.Scanner;

public class P5 {
  void main() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int base = 2;
    int ans = 0;
    int place = 1;

    while (num > 0) {
      int rem = num % base;
      ans = rem * place + ans;
      place = place * 10;
      num = num / base;
    }

    IO.println(ans);
  }
}
