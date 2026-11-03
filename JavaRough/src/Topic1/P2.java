package Topic1;

public class P2 {
  void main() {
    int a = 10;
    int b = 30;
    IO.println("Before swap a: " + a);
    IO.println("Before swap b: " +b);
    int temp = a + b;
    a = temp - a;
    b = temp - b;
    IO.println("After swap a: " + a);
    IO.println("After swap b: " +b);

  }
}
