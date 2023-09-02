package java_lesson2;
public class Person {
  // 変数の直接の変更を禁止しメソッド経由にするためにprivateを使用 //
  private static int count = 0;

  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;
  private String job;

  // コンストラクタ //
  Person(String firstName, String lastName, int age, double height, double weight, String job) {
    Person.count ++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.job = job;
  }

  // middleName対策のコンストラクタ //
  Person(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
    this(firstName, lastName, age, height, weight, job);
    this.middleName = middleName;
  }

  // ゲッター //
  public String getMiddleName() {
    return this.middleName;
  }
  
  public String getJob() {
    return this.job;
  }

  // セッター // 
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public void printData() {
    System.out.println("おっす！オラ" + this.fullName() + "てーんだ");
    System.out.println("としは" + this.age + "歳だぞ");
    System.out.println("BMIちゅーやつが" + Math.round(this.bmi()) + "らしいんだ");
    System.out.println("仕事は" + this.job + "をやってっぞ");
    System.out.println("よろしくな！");
  }
  
  public static void printCount() {
    System.out.println("自己紹介は計" + Person.count + "回です");
  }
}
