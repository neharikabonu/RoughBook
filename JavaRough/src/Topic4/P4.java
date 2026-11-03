package Topic4;

import java.util.Scanner;

public class P4 {
  void main() {

    //prime numbers logic
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int j = 2; j <= n; j++) {
      boolean isPrime = true;
    for (int i = 2; i*i <= j; i++) {
      if (j % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      IO.println(j);
    }
    }
  }
}
