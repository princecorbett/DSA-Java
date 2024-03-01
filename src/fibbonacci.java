import java.util.*;
public class prime_N_nos {
    public static void main(String[] args)
    {
      int n1=0,n2=1,n3;
      Scanner scn = new Scanner(System.in);
      n3 = scn.nextInt();
      System.out.println("Enter the number: ");
      for(int i=2 ; i <= n3;i++)
      {
          n3=n1+n2;
          System.out.println(n3);

      }
    }
}

