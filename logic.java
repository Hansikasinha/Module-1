
import java.util.Scanner;

public class logic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter age");  
       int age =sc.nextInt();
        boolean hasLicense=true;
        if (age>18 && hasLicense){
            System.out.println("eligible to drive");
        }
        else{
            System.out.println("not eligible for driving");
        }

    }
}