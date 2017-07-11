package hr.introduction;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/java-if-else
 */
public class JavaIfElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // Note: The code below is a very bad form. I'll tell you why later.
    String ans;
    if (n % 2 == 1) {
      ans = "Weird";
    } else if (n >= 2 && n <= 5) {
      ans = "Not Weird";
    } else if (n >= 6 && n <= 20) {
      ans = "Weird";
    } else {
      ans = "Not Weird";
    }

    System.out.println(ans);
  }
}
