import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size  = scanner.nextInt();
    int [] array = new int[size+1];
    int i;
    for ( i = 0; i < size; i++){
      array[i] = scanner.nextInt();
    }
    array[i] = -1;
    System.out.println(peak(array));
  } // main function end
  public static int peak(int[] arr){
    if (arr.length >=2){
      if(arr[0] > arr[1]){
        return 0;
      }
    }
    for(int i = 1; i < arr.length; i++){
          if(arr[i] > arr[i+1]  && arr[i] > arr[i-1] ){
            return i;
          }
    }
    return -1;
  } // peak function end
} // class end
