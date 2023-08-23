class Person {
  public static void printData(String name, int age, double height, double weight, String bloodType ) {
    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    if (isAdult(age)) {
      System.out.println("成年者です");
    } else {
      System.out.println("未成年者です");
    }
    
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("血液型は" + bloodType + "型です");
    
    double bmi = bmi(height, weight);
    System.out.println("BMIは" + Math.round(bmi) + "です");
    if (isHealthy(bmi)) {
      System.out.println("健康です");
    } else {
      System.out.println("健康ではありません");
    }
    
  }
  public static boolean isAdult(int age) {
    return 20 <= age;
  }
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }
  public static boolean isHealthy(double bmi) {
    return 18.5 < bmi && bmi > 25.0;
  }
  
}