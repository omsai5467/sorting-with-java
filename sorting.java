

// it is a java file collection of sorting Algorithams
// in this file i created a simpe sortig algoriths
// sorting algorithm that are implenmented in
// 1.bubbleSort 2.Selection sort 3.Merge sort 4.quickSort algorithams are implemented in easyest way
// java in sorting
import java.util.Random;
import java.util.Scanner;
class sorting {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter The Size of the Array");
    int size = input.nextInt(); // array size defined here
    int [] arr = new int [size];   //intilized array with its size
    generateArray(arr);
    System.out.println("Select Sorting Algorithams");
    System.out.println("  Select 1.bubbleSort \n 2.Selection Sort Algorithm \n 3.Merge sort algorithm \n 4.quickSort algorithm ..... ");
    int chooseOption = input.nextInt();
    if(chooseOption == 1 ){
      bubbleSort(arr);
      System.out.println("you Selected Bubble Sort Algorithm");
    }
    if(chooseOption == 2 ){
      selectionSort(arr);
      System.out.println("you Selected Selection  Sort Algorithm");
    }
    if(chooseOption == 3 ){
      merge(arr);
      System.out.println("you Selected merge Sort Algorithm");
    }
    if(chooseOption == 4 ){
     q(arr);
      System.out.println("you Selected quick   Sort Algorithm");
    }
    else{
      System.out.println("You selected in valid key...");
    }
     // it gives the random array
    // bubbleSort(arr);
    // selectionSort(arr);
    // merge(arr);
    // q(arr);
  }
  //bubbleSort
  public static void bubbleSort(int [] arr){
    for (int i=0; i<arr.length-1; i++){
      for (int j= i+1 ; j<arr.length; j++){
          if(arr[i] > arr[j]){
            swap(arr,i,j);
          }
      }

    }
    printArray(arr);
    checkArray(arr);

  }
  //selectionSort
  public static void selectionSort(int[] arr){
    int minimum;
    for(int i=0; i<arr.length; i++){
      minimum = i;
      for(int j=i+1; j<arr.length; j++){
        if(arr[minimum] > arr[j]){
          minimum = j;
        }
      } //inner lop end
      swap(arr, minimum,i);
    } //outer loop end
    printArray(arr);
    checkArray(arr);
  }
  // swaping function
  public static void swap(int [] arr,int a,int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
  //printArray
  public static void printArray(int [] arr){
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
  //checkArray
  public static void checkArray(int [] arr){
     for(int i = 0; i < arr.length-1; i++){
       if(arr[i] <= arr[i+1]){

       }
       else{
         System.out.println("Array is Not Sorted");
         return;
       }
     }
     System.out.println("Array Is Sorted");

    }
    //it Genarates the random Array
  public static void generateArray(int[] arr){
    Random r = new Random();
    for(int i=0; i<arr.length; i++){
      arr[i] = r.nextInt(500);
    }
  }
  //merge sort function start
  public static void merge(int [] arr){
    mergeSort(arr,0,arr.length - 1);
    checkArray(arr);
    printArray(arr);
  }
  //merge Sort
  public static void mergeSort(int [] arr,int start,int end){
    if(start < end){
      int mid = (start + end) / 2;
      mergeSort(arr,start,mid);
      mergeSort(arr,mid+1,end);
      merge(arr,start,mid,end);
    }
  }
  //merge function
  public static void merge(int [] arr,int start,int mid,int end){
    // System.out.println("Callsed");
    int [] temp = new int [end - start + 1];
    int s = start;
    int m = mid+1;
    int k = 0;
    while(s <= mid && m <= end){
      if(arr[s] <= arr[m]){
        temp[k] = arr[s];
        s = s+ 1;
        k = k +1;
    }
    else{
      temp[k] = arr[m];
      m = m + 1;
      k = k +1;
    }
  }
  while (s <= mid){
    temp[k] = arr[s];
    s = s+1;
    k = k +1;
  }
  while (m <= end){
    temp[k] = arr[m];
    m = m+1;
    k = k +1;
  }
  int j = start;
  for (int i = 0; i<temp.length;i++){
    arr[j] = temp[i];
    j = j + 1;
  }


  }
  //merge sort ending
 //quick sort starting point
 public static void q(int [] arr){
   quickSort(arr,0,arr.length-1);
   printArray(arr);
   checkArray(arr);
 }
 public static void quickSort(int [] arr,int start,int end){
   if(start < end){
     int pi = p(arr,start,end);
     quickSort(arr,start,pi-1);
     quickSort(arr,pi+1,end);
   }
 }

 public static int p(int [] arr,int start,int end){
   int pivot = arr[start];
   int lower = start;
   int upper = end;
   while (lower <= upper){
     while(arr[lower] <= pivot){
       lower = lower + 1;
       if (lower > upper){ break; }
     }
     while(arr[upper] > pivot){
       upper = upper - 1;
     }
     if(lower < upper){
       swap(arr,lower,upper);
     }
 }
 swap(arr,start,upper); //
 return upper;
}
//quick sortis end here

} // end of class
