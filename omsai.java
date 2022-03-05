
import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int [] arr =  new int[scanner.nextInt()];
		int target = scanner.nextInt();
		for(int i = 0; i < arr.length; i++){
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++){
			if (target == arr[i]){
				System.out.print(i + " ");
			}
		}
	}
}