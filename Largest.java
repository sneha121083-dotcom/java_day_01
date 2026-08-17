import java.util.*;
public class Largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st number : ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number : ");
        b=sc.nextInt();
        System.out.println("Enter 3rd number : ");
        c=sc.nextInt();
        
        if(a>b && a>c){
            System.out.println(a + " is the largest number");
        }
        else if(b>c){
            System.out.println(b+ " is the greatest number");
        }
        else{
            System.out.println(c+ " is the larges number");
        }
    }
}