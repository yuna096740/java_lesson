package java_lesson6;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    fizzBuzz1 fb1 = new fizzBuzz1();
    FizzBuzz2 fb2 = new FizzBuzz2();


    System.out.print("番号を入力:");
    // int end = scanner.nextInt();
    // fb1.fizzbuzz(end);

    int i = scanner.nextInt();
    fb2.fizzbuzz(i);
  }
}