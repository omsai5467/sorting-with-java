// import java.util.*;
import java.io.*;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int [] arr = new int[scanner.nextInt()];
    for(int i=0; i<arr.length; i++){
      arr[i] = scanner.nextInt();
    }
    System.out.println(pairss(arr)); //
  } // main() method
  public static int pairss(int [] arr){
    int p = 0; //
    for(int i = 0; i <arr.length; i++){
      for(int j = i+1; j < arr.length; j++){
        if (arr[i] == arr[j] && i < j){
          // System.out.println("i,j" + i + "," + j);
          // System.out.println(arr[i] +"" + arr[j]);
          p = p + 1;
        }
      }
    }
    return p;
  } //pairs()
} //class Main
