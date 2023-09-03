package java_lesson4;
// 抽象クラス(abstract) //
abstract class Vehicle {
  // サブクラスでも使える(protected) //
  protected String name;
  protected String color;
  protected int distance = 0;
  // Person型のowner(インスタンス)フィールドを追加 //
  // 他のクラスのオブジェクトへの参照を保持できる //
  protected Person owner;

  Vehicle(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public Person getOwner() {
    return this.owner;
  }
  public void setOwner(Person person) {
    this.owner = person;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void setDistance(int distance) {
    this.distance = distance;
  }

  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }

  // 抽象メソッド(abstract) //
  // (サブクラスがメソッドをオーバーライドし、処理内容を定義することを強制) //
  public abstract void run(int distance);
  // 抽象メソッドを1つでも持つクラスは、抽象クラスとなる //
}
