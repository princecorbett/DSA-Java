import java.util.*;
public class prime_N_nos {
    public static void main(String[] args)
        {
        int low, high;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        low = sc.nextInt();
        high = sc.nextInt();
        for(int i=low; i<= high; i++)
        {
            int count = 0;
            for(int div=2; div*div <= i ;div++) {
                if(i % div ==0){
                    count++;
                    break;
            }}
            if(count ==0) {
                System.out.println(i);
            }
            }
        }
    }

