package recursion.programs;

public class Fibonacci {

  public static int calculate(int n) {
    if (n <= 1) {
      return n;
    } else {
      return calculate(n - 1) + calculate(n - 2);
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.print(calculate(i) + " ");
    }
    int res = calculate(9);
    System.out.println("res "+res);
  }
}