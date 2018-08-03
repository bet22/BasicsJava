import java.util.Arrays;
// Тестируем что быстрее. Метод sort или просто пройти и найти числа одним проходом

class SortOrFind{
  public static void main(String[] args){

    int repeat = 0;
    int[] arr = new int[1000000];
    int one = 0;
    int two = 300;
    
// Заполняем массив arr случайными чистами в диапозоне от one до two
    for (int i=0; i<arr.length; i++){
      arr[i] = (int)(Math.random()*(two-one))+one;
    }

// Записываем текущее время в переменную first
    long first = System.currentTimeMillis();

// Сортируем данные в массиве
    Arrays.sort(arr);

    long middle = System.currentTimeMillis();

// Расчитываем время сортировки
    long timeSort = middle - first;

    for (int i=0; i<arr.length; i++){
      if (arr[i]==8) repeat++;
    }
    
    long last = System.currentTimeMillis();
    
    System.out.println("Время выполнения сортировки: " + timeSort + "\nВремя выполнения прохода: "+ (last - middle) + ",\nКоличество повторений = " + repeat);

  }
}