package java_lesson4;
// Vehicleクラスから継承(extends) //
class Car extends Vehicle {
  private int fuel = 60;

  Car(String name, String color) {
    // スーパークラスのコンストラクタを呼び出す(super) //
    super(name, color);
  }

  public int getFuel() {
    return this.fuel;
  }

  @Override
  public void printData() {
    // スーパークラスのインスタンスメソッドを呼び出す //
    super.printData();
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

  @Override
  public void run(int distance) {
    System.out.println(distance + "km走ります");
    if (distance <= this.fuel) {
      this.distance += distance;
      this.fuel -= distance;
    } else {
      System.out.println("ガス欠になります");
    }
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

  public void charge(int litre) {
    System.out.println(litre + "L給油します");
    if (litre <= 0) {
      System.out.println("給油できません");
    } else if (litre + this.fuel > 60) {
      System.out.println("満タンオーライッ！");
      this.fuel = 60;
    } else {
      this.fuel += litre;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
}
