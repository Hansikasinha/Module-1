import java .util.*;
public class calc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("addition of the number"+c);
        int d=a-b;
        System.out.println("subtraction of the number"+d);
        int e=a*b;
        System.out.println("multiplication of the number"+e);
        int f=a/b;
        System.out.println("division of number"+f); 
    }
}