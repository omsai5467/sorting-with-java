


import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int [] array = new int[size];
    for(int i = 0; i < array.length; i++){
      array[i] = scanner.nextInt();
    }
    System.out.println(secondlargest(array));
  } // end main()
  public static int secondlargest(int[] arr){
    int max =Integer.MIN_VALUE ;
    for(int i = 0; i < arr.length; i++){
      if (arr[i] > max){
        max= arr[i];
      }
    }
    int secondlargest = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > secondlargest  && arr[i] !=max){
        secondlargest= arr[i];
      }
    }
    return secondlargest;

  } // end second largest function
} // class Main
