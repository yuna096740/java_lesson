package java_lesson6;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    fizzBuzz1 fb = new fizzBuzz1();

    System.out.print("番号を入力:");
    int end = scanner.nextInt();
    fb.fizzbuzz(end);
  }
}
