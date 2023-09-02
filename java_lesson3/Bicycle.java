package java_lesson3;
import java.util.Scanner;

class Bicycle {
  private String name;
  private String color;
  private int distance = 0;
  private Scanner scanner = new Scanner(System.in);
  
  Bicycle(String name, String color, int distance) {
    this.name = name;
    this.color = color;
    this.distance = distance;
  }
  
  public void run(int distance) {
    while(distance > 20) {
      System.out.println("チャリで" + distance + "kmはキツすぎる。。");
      System.out.print("何km走る？:");
      distance = scanner.nextInt();
    } 
    System.out.println(distance + "km走るよー!");
    this.distance += distance;
    System.out.println("走行距離：" + this.distance + "km");
  }
  
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }
}