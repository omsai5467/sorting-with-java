

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int k = input.nextInt();
    int [] arr = new int[size];
    for(int i = 0; i < size; i++){
      arr[i] = input.nextInt();
    }
    int max = 0;
    for (int i = 0; i < size; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    for (int i = 1; i < max; i++){
      int mid  = i;
      long sum = 0;
      for(int j = 0; j < size; j++){
        sum = sum + (arr[j] + mid - 1)/mid;
      }
      if(sum <= k){
        System.out.print(i);
        break;
      }
    }
  }
}
