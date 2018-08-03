import java.util.Arrays;
// ��������� ��� �������. ����� sort ��� ������ ������ � ����� ����� ����� ��������

class SortOrFind{
  public static void main(String[] args){

    int repeat = 0;
    int[] arr = new int[1000000];
    int one = 0;
    int two = 300;
    
// ��������� ������ arr ���������� ������� � ��������� �� one �� two
    for (int i=0; i<arr.length; i++){
      arr[i] = (int)(Math.random()*(two-one))+one;
    }

// ���������� ������� ����� � ���������� first
    long first = System.currentTimeMillis();

// ��������� ������ � �������
    Arrays.sort(arr);

    long middle = System.currentTimeMillis();

// ����������� ����� ����������
    long timeSort = middle - first;

    for (int i=0; i<arr.length; i++){
      if (arr[i]==8) repeat++;
    }
    
    long last = System.currentTimeMillis();
    
    System.out.println("����� ���������� ����������: " + timeSort + "\n����� ���������� �������: "+ (last - middle) + ",\n���������� ���������� = " + repeat);

  }
}