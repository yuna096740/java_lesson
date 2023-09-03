package java_lesson4;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Person person1 = new Person("悟空", "孫", 27, 1.75, 62);
    Person person2 = new Person("大魔王", "ピッコロ", 8, 2.26, 116);

    Car car = new Car("教習所の車", "黄色");
    Bicycle bicycle = new Bicycle("教習所のチャリ","赤");

    person1.buy(car);
    person2.buy(bicycle);

    System.out.println("【車の情報】");
    car.printData();
    System.out.println("-----------------");

    System.out.println("【車の所有者の情報】");
    car.getOwner().printData();
    System.out.println("-----------------");
    
    System.out.print("彼と車で何km走る？:");
    int carDis = scanner.nextInt();
    car.run(carDis);
    System.out.println("-----------------");
    
    System.out.print("給油する量を入力してください：");
    int fuelCharge = scanner.nextInt();
    car.charge(fuelCharge);
    System.out.println("=================");

    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("-----------------");
    
    System.out.println("【自転車の所有者の情報】");
    bicycle.getOwner().printData();
    System.out.println("-----------------");
    
    System.out.print("彼と自転車で何km走る？:");
    int bicycleDis = scanner.nextInt();
    bicycle.run(bicycleDis);
    System.out.println("=================");
  }
}
