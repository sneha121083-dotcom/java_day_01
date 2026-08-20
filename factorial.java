import java.util.*;
public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        long n=sc.nextLong();
        long fact=1;
        if(n==0 || n==1){
            fact=1;
        }else{
            for(long i=2;i<=n;i++){
                fact=fact*i;
            }
        }
        System.out.println("Factorial of "+ n + " is "+ fact);
    }
}