import java.util.Scanner;
public class n_names{
    public static void main(String[] args){
         System.out.println("Enter the name you no of name you wanted to print : ");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        String[] names=new String[n];
        System.out.println("enter n names : ");
        for(int i=0;i<n;i++){
            System.out.println("Name "+(i+1)+" : ");
            names[i]=sc.nextLine();
        }
        System.out.println("\n Names you entered are: ");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+". "+names[i]);
        }
    }
}