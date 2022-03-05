

// import java.util.*;
import java.io.*;
import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] arr = new int[scanner.nextInt()];
    int k = scanner.nextInt();
    for (int i = 0; i < arr.length;i++){
      arr[i] = scanner.nextInt();
    }
    System.out.println(slidingWindow(arr, k) - slidingWindow(arr, k - 1));


  } //main()
  public static  int slidingWindow(int[] nums, int k) {
        int count = 0, ans = 0;
        for (int begin = 0, end = 0; end < nums.length; end++) {
            if ((nums[end] & 1) == 1) {
                count++;
            }
            while (count > k) {
                if ((nums[begin++] & 1) == 1) {
                    count--;
                }
            }
            ans += end - begin + 1;
        }
        return ans;
    }
} // Main
