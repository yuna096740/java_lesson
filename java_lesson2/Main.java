package java_lesson2;

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person("孫", "悟空", 18, 1.75, 62.0, "サイヤ人");
    person1.printData();
    person1.setJob("農家");
    System.out.println("チチに言われて仕事を" + person1.getJob() + "に変えたぞ");
    System.out.println("おら、修行してーんだけどな");
  }
}
