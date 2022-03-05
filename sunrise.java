

import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int [] array = new int[size];
    for (int i = 0; i < array.length; i++){
      array[i] = scanner.nextInt();
    }
    System.out.println(sunrise(array));
  } //main ()
  public static int sunrise(int[] arr){
    int count = 1;
    int n = arr.length;
        // Start traversing element
        int curr_max = arr[0];
        for (int i = 1; i < n; i++) {

            // If curr_element is maximum
            // or current element
            // is equal, update maximum and increment count
            if (arr[i] > curr_max || arr[i] == curr_max) {
                count++;
                curr_max = arr[i];
            }
        }
    return count;
  } //sunrise()



} // class Main
