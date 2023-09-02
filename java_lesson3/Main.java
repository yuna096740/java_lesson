package java_lesson3;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bicycle = new Bicycle("チャリンコ４号", "レインボー", 0);
    System.out.println("【チャリンコの情報】");
    bicycle.printData();
    System.out.println("-----------------");
    
    System.out.print("何km走る？:");
    int bicycleDis = scanner.nextInt();
    bicycle.run(bicycleDis);
    System.out.println("=================");
    
    Car car = new Car("軽トラ", "200色ある白", 0, 100);
    System.out.println("【車の情報】");
    car.printData();
    System.out.println("-----------------");
    
    System.out.print("何km走る？:");
    int carDis = scanner.nextInt();
    car.run(carDis);
    System.out.println("-----------------");
    
    System.out.print("給油する量を入力してください：");
    int fuelCharge = scanner.nextInt();
    car.charge(fuelCharge);
  }
}