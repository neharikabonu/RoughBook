package Topic2;

import java.util.Scanner;

public class P1 {
  void main() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int ans = num & 1;
    if (ans == 0) {
      IO.println("even");
    } else {
      IO.println("odd");
    }
  }
}
