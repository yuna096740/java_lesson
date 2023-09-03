package java_lesson4;

import java.util.Scanner;

// Vehicleクラスから継承(extends) //
class Bicycle extends Vehicle {
  private Scanner scanner = new Scanner(System.in);

  Bicycle(String name, String color) {
    super(name, color);
  }

  @Override
  public void run(int distance) {
    while(distance > 20) {
      System.out.println("チャリで" + distance + "kmはキツいよ。。");
      System.out.print("何km走る？:");
      distance = scanner.nextInt();
    }
    System.out.println(distance + "km走っていくぅ!");
    this.distance += distance;
    System.out.println("走行距離：" + this.distance + "km");
  }
}
