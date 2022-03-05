
import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int [] arr = new int[scanner.nextInt()];
    for(int i=0; i<arr.length; i++){
      arr[i] = scanner.nextInt();
    }
    if(divide(0,0,0,arr)){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  } // main function
  public static boolean divide(int i , int a,int b,int [] arr){
    if(i >= arr.length){
      return a%10 == 0 && b %2 == 1;
    }
    return divide(i+1,a+arr[i],b,arr)  || divide(i+1,a,b+arr[i],arr);

  }
} // main()
