import java.util.Scanner;
public class digit_counter {
    public static void main(String[] args)
    {
        int dig;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dig = 0;
        while(n!=0){
            n= n / 10;
            dig++;
        }
        System.out.println(dig);
    }
}
