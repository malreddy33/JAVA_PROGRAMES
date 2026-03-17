import java.util.Scanner;
public class Palidrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int o=n;
        int digit;
        int rev=0;
        while(n>0){
            digit = n%10;
            rev=rev*10+digit;
            n=n/10;
        }

        if(rev == o){
            System.out.println("palidrome");
        }else{
            System.out.println("not polidrome");
        }
    }
}
