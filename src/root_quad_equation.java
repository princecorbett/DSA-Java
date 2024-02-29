import java.util.Scanner;

public class root_quad_equation {
    public static void main(String[] args)
    {
        int a,b,c;
        System.out.println("Enter the a and b and c ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double r1,r2;
        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Roots are " +r1+ " " + r2);
    }
}
