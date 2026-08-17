import java.util.*;
public class Multiplication_table{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("Multiplication table of n is : ");
        for(int i=1;i<11;i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}