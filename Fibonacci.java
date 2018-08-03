/**
* Расчитываем число Фибаначи
* И замеряем время вычисления
* @autor Betyov A.A.
* @since 02.02.2018
* @version 1
*/

import java.util.Scanner;
//import java.util.Arrays;

public class Fibonacci {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Расчет числа Фибаначи. Если ввести число больше 50, то придётся долго ждать...");
    System.out.print("Введите число: ");

    int a = scan.nextInt();
    long start = System.currentTimeMillis();
    System.out.print("Число Фибаначи = " + fib(a));
    long timeWorkCode = (System.currentTimeMillis() - start)/1000;  
    System.out.println();
    System.out.print("Время работы программы = " + timeWorkCode);
  }

//Сам расчёт числа Фибаначи
  static int fib (int n) {

   if (n==1 || n == 2) {
     return 1;
   }
   return fib (n-2) + fib (n-1);
  }
}