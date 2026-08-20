import java.util.*;
public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        //saving the copy of n in temp so that we won't destroy it while performing rev
        long temp=n;
        
        //reversing the num and keeping it in rev
        long rev=0;
        while(temp >0){
            rev=(rev*10)+(temp%10);
            temp=temp/10;
        }

        //checking if n = temp or not
        if(n==rev){
            System.out.println(n+ " is palindrome");
        }
        else{
            System.out.println(n+ " is not palindrome");
        }
    }
}