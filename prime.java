import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value if n : ");
        int n=sc.nextInt();
        boolean isprime=true;
        //checking if prime or not
        if (n<=1){
            isprime=false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        //printing the final result
        if(isprime){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+ " is not prime");
        }
    }
}