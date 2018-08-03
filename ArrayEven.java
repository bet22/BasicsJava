/**
* Массив array наполняется случайными числами от 0 до 9
* Массив arraylist заполняется четными числами из массива array
* И выводит на экран
* @autor Betyov A.A.
* @since 13.01.2018
* @version 1
*/

import java.util.ArrayList;

public class ArrayEven {

  public static void main(String[] args) {

    ArrayList<String> arraylist = new ArrayList<String>();
    int[] array = new int[15];

    for (int i = 0; i < array.length; i++){
      array[i] = (int) (Math.random() * 9);
      System.out.print(array[i] + " ");
      if (array[i] % 2 == 0){
        arraylist.add(Integer.toString(array[i]));
      }
    }	

    System.out.print("\n" + arraylist);
  }

}
