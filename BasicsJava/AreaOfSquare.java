package BasicsJava;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side of Square: ");
        int side = sc.nextInt();
        int SquareArea = side *side;
        System.out.println("Area of Square is : "+SquareArea);
    }
}
