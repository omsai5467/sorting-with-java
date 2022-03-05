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
    System.out.println("first loop");
    while(arr[lower] <= pivot){
      lower = lower + 1;
      System.out.println("second loop");
      if (lower > upper){
        break;
      }
    }
    while(arr[end] > pivot){
      System.out.println("third loop");
      end = end - 1;
    }
    if(lower < upper){
      swap(arr,lower,upper);
    }
}
swap(arr,start,upper); //
return upper;
}
