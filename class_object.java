import java.util.Scanner;
public class class_object {

    String name;
    int age;
    int roll_number;
    
 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        class_object object=new class_object();
        object.name= sc.nextLine();
        object.age=sc.nextInt();
        object.roll_number=sc.nextInt();

        System.out.println("name:" +object.name+"\nage: "+object.age+"\nroll_number: "+object.roll_number);
    }
}
