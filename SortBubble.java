/*
  * Самопальная сортировка методом пузырька
  * @autor Betyov A.A.
  * @since 03.08.2018
  * @version 1
*/

public class SortBubble {

  public static void main(String[] args) {

    int[] arr = new int[10];
    int temp = 0;

    System.out.println("Числа в массиве:");

// Заполняем массив случайными числами и выводим им в консоль
    for (int i=0; i<arr.length; i++){
      arr[i] = (int)(Math.random()*(10-0))+0;
      System.out.print(arr[i] + ", " );
    }
    
    System.out.println("\nВозрастающая последовательность: ");

// Реализация сортировки
    for (int j=0; j<arr.length-1; j++){
      for (int i=0; i<arr.length-1; i++){
        if (arr[i]>arr[i+1]) {
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }
    }

// Вывод результата
    for (int i=0; i<arr.length; i++){
      System.out.print(arr[i] + ", ");
    }
  }
}