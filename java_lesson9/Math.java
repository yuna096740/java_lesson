package java_lesson9;

public class Math {

  public void lesson1() {
    // ０~1000まで39を加算していき、29を0~500まで減産した時の全ての和を求める。

    int ave = 0;
    int plus = 39;
    int minus = 29; 
    
    for (int i = 0; i <= 1000; i++) {
      for (int j = 0; j <= 500; j++) {
        ave = i + plus;
        ave = j - minus;
      }
    }
    System.out.println(ave);
  }
}
