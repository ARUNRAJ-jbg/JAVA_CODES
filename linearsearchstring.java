import java.util.*;
public class Array{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number:");
    String[] marks={"arun","sri","raj","ram"};
    
    String n=sc.nextLine();
    for(int i=0;i<marks.length;i++)
    {
        if(marks[i].equals(n))
        {
            System.out.print("number found");
            return;
        }
    }
    System.out.println("number not found");
        }
    }
