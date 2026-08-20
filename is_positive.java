import java.util.*;
public class is_positive{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        if(n>0){
            System.out.println(n+" is postive");
        }
        else if(n<0){
            System.out.println (n +" is negative");  
        }
        else{
            System.out.println(n+ " is zero");
        }
    }
}