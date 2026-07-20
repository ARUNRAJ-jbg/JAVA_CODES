import java.util.*;
public class Array{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.print("enter the"+(i+1)+"element:");
        arr[i]=sc.nextInt();
    }
    System.out.println("even element are:");
    for(int i=0;i<n;i++)
    {
        if(arr[i]%2==0)
        {
            System.out.print(arr[i]+" ");
        }
    }
 }
}
