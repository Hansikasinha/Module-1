import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"");
        }
        sc.close();

    }
}
