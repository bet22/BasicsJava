/*
   Выводим случайные числа в консоль. В диапозоне от max до min
*/

public class Random1 {

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++){
      int max = -3;
      int min = 3;
      double rnd = (Math.random()*(max-min))+min;
      System.out.println(rnd);
    }
  }
}
