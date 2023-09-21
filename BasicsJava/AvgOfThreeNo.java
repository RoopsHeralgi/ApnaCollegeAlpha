package BasicsJava;

import java.util.Scanner;

public class AvgOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int Avg = (a+b+c)/3;
        System.out.println("Average of 3 Numbers is: "+Avg);
    }
}
