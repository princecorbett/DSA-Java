import java.util.*;
public class fibbonacci {
    public static void main(String[] args)
    {
      int n1=0,n2=1,n,n3;
      Scanner scn = new Scanner(System.in);
      n = scn.nextInt();
      for(int i=0; i < n ; i++)
      {
          System.out.println(n1);
          n3=n1+n2;
          n1=n2;
          n2=n3;
      }
    }
}

