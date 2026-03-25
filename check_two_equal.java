import java.util.Scanner;
public class check_two_equal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        System.out.println("str1 == str2: "+(str1 == str2));
        System.out.println("str1.equal(str2) : "+str1.equals(str2));

    }
    
}
