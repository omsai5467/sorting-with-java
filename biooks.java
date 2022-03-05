import java.util.Scanner;



class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int days = input.nextInt();
    int [] arr = new int[size];
    for (int i = 0; i < size; i++){
      arr[i] = input.nextInt();
    }
    int total = 0;
    for (int i = 0; i < size; i++){
      total = total + arr[i];
    }
    int max = -1;
    int val = 0;
    for (int i = 0; i < size;i++){
      val = arr[i];
      if (max == -1){
        max = val;
      }
      if (val > max){
        max = val;
      }
    }
    int s = 0;
    int k = 0;
    int td= 0;
    for (int i = max; i < total; i++){
      td = k(arr,i);
      if(td == days){
        if (s == 0 && k ==0){
          s = i;
          k = 1;
        }
        if(i < s){
          s = i;
        }
      }
    }
    System.out.println(s);
  } // end maoin

  public static int k(int [] arr,int size){
    int sum = 0; int i = 0;int d=0;
    int count  =0;
    while (i < arr.length){
      sum = 0;
      while (sum <= size && i < arr.length){
        sum = sum + arr[i];
        if (sum <= size){
          i = i + 1;
        } //end if
      }//outer while end
      count = count + 1;
      d= d+ 1;
      if (count > arr.length){
        return 0;
      }
    } //outer while loop
    return d;
  }//function end



} // end class
