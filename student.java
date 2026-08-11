import java.util.Scanner;
class Student1{
    String name;
    int age,marks,roll_no;
    void get_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter yr name : ");
        name=sc.nextLine();
        System.out.println("enter roll_no : ");
        roll_no=sc.nextInt();
        System.out.println("enter yr age : ");
        age=sc.nextInt();
        System.out.println("enter yr marks : ");
        marks=sc.nextInt();
    }
    void display_details(){
        System.out.println("***printing details***");
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Roll_no="+roll_no);
        System.out.println("Marks="+marks); 
    }
}
public class student{
    public static void main(String[] args){
        Student1 s1=new Student1();
        s1.get_details();
        s1.display_details();
    }
}