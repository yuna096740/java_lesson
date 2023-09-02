package java_lesson2;

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person("孫", "悟空", 18, 1.75, 62.0, "サイヤ人");
    person1.printData();
    person1.setJob("農家");
    System.out.println("だけどチチに言われて仕事を" + person1.getJob() + "に変えたぞ");
    System.out.println("おら、修行してーんだけどな");

    System.out.println("--------------------");

    Person person2 = new Person("孫", "悟空", 27, 1.75, 75.0, "スーパーサイヤ人");
    person2.printData();
    person2.setJob("");
    System.out.println("だけどまたチチに言われて仕事を" + person1.getJob() + "に変えたぞ");
    System.out.println("いくら強くなっても、チチにはかなわねーな！");
  }
}
