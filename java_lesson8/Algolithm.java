package java_lesson8;

class Algolithm {

  public void arrayLesson() {
    int[] array = { 1, 2, 3, 4, 5 };

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public void arrayLesson2() {
    int[] array = {1,2,3,4,5};

    for (int i = 0; i <= 4; i++) {
      array[i] *= 2;
    }

    for (int i = 0; i < array.length; i++ ) {
      System.out.println(array[i]);
    }
  }
}
