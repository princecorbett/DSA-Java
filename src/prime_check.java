import java.util.Scanner;
public class prime_check {
    public static void main(String[] args)
    {
        int t,n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter how much nos you want to check: ");
        t = scn.nextInt();
        for(int i =0 ; i<t; i++)
        {
            n = scn.nextInt();
            int count = 0;
            for(int div=2 ; div*div <=n ; div++)
              {
                if(n % div == 0) {
                    count++;
                    break;
                }
              }
            if(count == 2)
            {
                System.out.println("prime");
            }
            else
            {
                System.out.println("not prime");
            }
            }


    }
}
