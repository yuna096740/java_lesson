import java.util.Scanner;

class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("何人分の情報を入力しますか：");
    
    int number = scanner.nextInt();
    int maxAge = 0;
    int totalAge = 0;
    
    for (int i = 0; i < number; i++) {
      System.out.println(i + 1 + "人目");
      
      System.out.print("名前：");
      String firstName = scanner.next();
      
      System.out.print("名字：");
      String lastName = scanner.next();
      String name = firstName + " " + lastName;
      
      System.out.print("年齢：");
      int age = scanner.nextInt();
      if (age > maxAge) {
        maxAge = age;
      }
      
      totalAge += age;
      
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();

      System.out.print("血液型(A,B,AB,O)");
      String bloodType = scanner.next();
      
      Person.printData(name, age, height, weight, bloodType);
    }
  System.out.println("最高年齢は" + maxAge + "歳です");
  totalAge /= number;
  System.out.println("平均年齢は" + totalAge + "歳です");
  }
}
