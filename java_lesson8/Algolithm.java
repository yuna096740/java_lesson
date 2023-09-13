package java_lesson8;

class Algolithm {

  public void arrayLesson() {
    int[] array = { 1, 2, 3, 4, 5 };

    //ここにプログラムを書きます。
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public void arrayLesson2() {
    int[] array = {1,2,3,4,5};

    //ここにプログラムを書きます。
    for (int i = 0; i <= 4; i++) {
      array[i] *= 2;
    }

    for (int i = 0; i < array.length; i++ ) {
      System.out.println(array[i]);
    }
  }

  public void arrayLesson3() {
    int[] a = { 1, 2, 3, 4, 5 };
    int[] b = { 6, 7, 8, 9, 10 };
    int[] c = new int[5];

    //ここにプログラムを書きます。
    for (int i = 0; i < a.length; i++) {
      c[i] = a[i] + b[i];
    }

    for (int i = 0; i < c.length; i++) {
      System.out.println(c[i]);
    }
  }

  public void arrayLesson4() {
    int[][] array = {
      { 1, 8, 12, 17, 20 },
      { 2, 5, 11, 13, 18 },
      { 4, 6, 9, 19, 21 }
    };

    //ここにプログラムを書きます。
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void arrayLesson5() {
    int[] score = { 45, 90, 75, 60, 80 };
    int[] rank = { 1, 4, 2, 3, 0 };

    System.out.println("----- 出席番号順 -----");
    //出席番号順の表示
    for (int i = 0; i < score.length; i++) {
      //ここにプログラムを書きます
      System.out.println((i + 1) + "番: " + score[i] + "点");
    }
    System.out.println("----- 得点順 -----");        
    //得点の高い順に表示
    for (int i = 0; i < score.length; i++){
      //ここにプログラムを書きます
      System.out.println((i + 1) + "位: " + score[rank[i]] + "点");
    }
  }
}
