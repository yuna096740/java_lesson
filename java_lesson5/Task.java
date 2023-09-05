package java_lesson5;

class Task {
  public void lesson1() {
    // 1〜10までの数字のうち偶数のみを昇順で表示させる
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      } 
    }
  }

  public void lesson2() {
    // 1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
    int count = 0;
    int ave = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        count ++;
        ave += i;
      }
    }
    System.out.println("偶数は" + count + "個です");
    System.out.println("偶数の合計は" + ave + "です");
  }

  public void lesson3() {
    // 1〜10までの整数をカンマ区切りで横並びで表示させる（10にはカンマをつけない）
    int array[] = new int[10];
    for (int i = 1; i <= 10; i++) {
      array[i - 1] = i;
      System.out.print(array[i - 1]);
      if (i < 10) {
        System.out.print(", ");
      }
    }
  }

  public void lesson4() {
    // 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
    // [0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
    int[] array2 = new int[20];
    // 要素に0から5ずつ加算して代入
    for (int i = 0; i < array2.length; i++) {
      array2[i] = i * 5;
    }

    // [0]から[10]までの奇数をカンマ区切りで表示
    for (int i = 1; i <= 20; i++) {
      if (array2[i] % 2 != 0 && i <= 10) {
        System.out.print(array2[i]);
        if (i < 10) {
          System.out.print(", ");
        }
      }
     
      if (array2[i] % 2 == 0) {
        System.out.print(array2[i]);
        if (i < 19) {
          System.out.print(", ");
        }
      }
    }
  }
}
