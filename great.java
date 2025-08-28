import java.util.*;
public class great{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr =new int [n];
        System.out.println("enter"+n+"elements:");
        for (int i = 0; i < n; i++) 
            arr[i]=sc.nextInt();
        int count=0;
        for(int num:arr) if(num>50) count++;
        System.out.println(" number greater than 50:" +count);
        sc.close();
        
    }
}