package java_lesson7;

// 1〜10の数字の偶数のみを大きい順に上から縦に並ぶように表示させる
class Task {
  public void lesson1() {
    for (int i = 10; i >= 2; i -= 2) {
      System.out.println(i);
    }
  }

  // 1〜10までの偶数が何個あるのか、偶数の合計は幾つになるかを表示させる問題
  public void lesson2() {
    int count = 0;
    int ave = 0;
    
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        count++;
        ave += i;
      }
    }
    System.out.println(count);
    System.out.println(ave);
  }

  // 1〜10までの整数をカンマ区切りで横並びで表示（10にはカンマをつけない）させる問題
  public void lesson3() {
    for (int i = 1; i <= 10; i++ ) {
      System.out.print(i);
      if (i < 10) {
        System.out.print(" ,");
      }
    }
  }

  // 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
  // [0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる問題
  public void lesson4() {
    int[] array = new int[20];

    for (int i = 0; i < 20; i++) {
      array[i] = i + 5;
    }

    System.out.print("奇数: ");
    for (int i = 0; i < 11; i++) {
      if (array[i] % 2 != 0) {
        System.out.print(array[i]);
        if (i < 10) {
          System.out.print(" ,");
        }
      }
    }

    System.out.println();

    System.out.print("偶数: ");
    for (int i = 11; i < 20; i++) {
      if (array[i] % 2 == 0) {
        System.out.print(array[i]);
        if (i < 19) {
          System.out.print(" ,");
        }
      }
    }
  }
}
