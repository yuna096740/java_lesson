package java_lesson3;

class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;
  
  Car(String name, String color, int distance, int fuel) {
    this.name = name;
    this.color = color;
    this.distance = distance;
    this.fuel = fuel;
  }
  
  public void run(int distance) {
    System.out.println(distance + "km走ります");
    if (distance <= this.fuel) {
      this.distance += distance;
      this.fuel -= distance;
    } else {
      System.out.println("ガス欠です");
    }
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
  
  public void charge(int fuel) {
    System.out.println(fuel + "L給油します");
    if (fuel <= 0) {
      System.out.println("給油できません");
    } else if (fuel + this.fuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    } else {
      this.fuel += fuel;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
  
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
}