

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    String b = scanner.nextLine();
    String result= "";
    int i = 0;
    int j = 0;
    int alen = a.length();
    int blen = b.length();
    while(i < alen || j < blen){
      if (i < alen ){
        result+=a.charAt(i);
        i = i +1;
      }
      if (j < blen){
        result+=b.charAt(j);
        j = j + 1;
      }
    }
    System.out.println(result);
  } //main()
} //class end
