import java.util.Scanner;
import java.util.Arrays;
// omsai omsai this is called

class BooksSearching{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int time = input.nextInt();
    int [] array = new int[size];
    int count = 0;
    for(int i = 0; i < size;i++){
      array[i] = input.nextInt();
    }
    // Arrays.sort(array);
    int i = 0;
    int j  = array.length - 1;
    int temp;
    int temp1;
    // while(time > 0){
    //   time  = time - array[i];
    //   if(time > 0){
    //     count =  count + 1;
    //   }
    //   i =  i + 1;
    //   if( i > array.length - 1){
    //     break;
    //   }
    // }
    while (i <= j && time > 0){

      temp = time - array[i];
      temp1 = time - array[j];
      if( temp > temp1 ){
        time = time - array[i];
        if(time > 0){
          count = count + 1;
          i = i +1;
        }

      }
      else{
        time = time - array[j];
        if(time > 0){

          j = j -1;
          count = count + 1;
        }
      }

    }
    System.out.println(count);
  } // end of main function
} //class end
