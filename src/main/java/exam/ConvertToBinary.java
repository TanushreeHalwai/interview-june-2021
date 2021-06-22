package exam;

import java.util.*;
public class ConvertToBinary {

  public String toBinary(Final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int a=n;
      int[] bno = new int [32];
      String res=null;
      int i=0;
      while(a>0)
      {
          bno[i]=a%2;
          a=a/2;
          i++;
      }
    res=Arrays.toString(bno);
    return res;
  }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);   
        int n=sc.nextInt();
        String number=null;
        number=toBinary(n);
        int j=number.length();
      System.out.println(number);
        
    }
}
