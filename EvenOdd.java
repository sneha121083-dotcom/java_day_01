import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if((n&1)==1){
            System.out.println(n + " is ODD");
        }
        else{
            System.out.println(n + " is EVEN");
        }
    }
}