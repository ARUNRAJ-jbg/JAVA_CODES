import java.util.*;
public class Array{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number:");
    int[] marks={10,20,40,50,60};
    
    int num=sc.nextInt();
    for(int i=0;i<marks.length;i++)
    {
        if(marks[i]==num)
        {
            System.out.print("number found");
            return;
        }
    }
    System.out.println("number not found");
        }
    }
    
