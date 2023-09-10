package java_lesson6;

class fizzBuzz1 {
  public void fizzbuzz(int end) {
    for (int i = 1; i <= end; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("Fizz Buzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}
