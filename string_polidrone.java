import java.util.Scanner;
public class string_polidrone{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= "malreddy";
        int l=s.length();
        System.out.println(l);
        int m =l%2; // 
        String[] k;

        int i;
        for(i=l-1;i>=l/2;--i){
            System.out.print(s.charAt(i));

        }
    }
}
