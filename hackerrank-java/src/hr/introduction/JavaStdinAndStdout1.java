package hr.introduction;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/java-stdin-and-stdout-1
 */
public class JavaStdinAndStdout1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    System.out.println(a);
    a = scan.nextInt();
    System.out.println(a);
    a = scan.nextInt();
    System.out.println(a);
  }
}
