
import java.util.Scanner;
class floor{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int [] array = new int[size];
    int search = input.nextInt();
    for(int i = 0;i<size;i++){
      array[i] = input.nextInt();
    }//end for
    int x = binarySearch(array,search);
    System.out.println(x);
  } // end main method
  public static int binarySearch(int [] arr,int k ){
    int start = 0;
    int end = arr.length-1;
    int mid;
    while(start <= end){
      mid = (start + end) / 2;
      if(arr[mid] >  k && arr[mid-1] <= k){
        return mid;
      }
      if(arr[mid] > k){
        end = mid - 1;
      }

    }//end while
    return -1;
  } //end of binary search
} // class floor
