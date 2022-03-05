// binary Search in java.util.

import java.util.Scanner;

class Search{
  public static void main(String[] args){
    Scanner  input = new Scanner(System.in);
    int size = input.nextInt();
    int [] array = new int[size];
    for(int i = 0; i < size; i++){
      array[i] = input.nextInt();
    }
    System.out.println("input taken");
    int x = binarySearch(array);
    System.out.println(x);
  } // end of main functiuon


  public static int binarySearch(int[] arr){
    int start = 0;
    int end = arr.length-1;
    int mid;
    if(arr[arr.length-1]==1){
      return arr.length;
    }
    if(arr[0]==0){
      return 0;
    }
    while (start <= end){
      mid = (start + end) /2;
      if(arr[mid] == 1 && arr[mid+1] == 0){
        return mid+1;
      }
      if(arr[mid] == 0){
        end = mid -1;
      }
      if(arr[mid] == 1){
        start = mid + 1;
      }

} //end of while loop
return -1;
} //end of binarySearch
} //end of class
