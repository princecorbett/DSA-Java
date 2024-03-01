import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args)
    {
        float area;
        float height;
        float base;
        System.out.println("Enter the base and height of the triangle:  ");
        Scanner sc = new Scanner(System.in);
        height=sc.nextFloat();
        base=sc.nextFloat();
        area = 0.5f * height * base;
        System.out.println("The area is :" + area);
    }
}

