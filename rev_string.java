import java.util.Scanner;
public class rev_string {
    public static void main(String[] args){
        String str="happy";
        int n=str.length();
        String rev="";

        
        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);


        }
        System.out.print(rev);
        System.out.println("\n");
        System.out.print(str);

    }
}
