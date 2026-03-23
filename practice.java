import java.util.Scanner;
public class practice{
    public static void main(String[] args){
        String name="malreddy";
        char[] s=name.toCharArray();

        int left=0;
        int right =s.length-1;

        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right--;

        }
        
        String reversed = new String(s);
        System.out.println(name);
        System.out.println(reversed);
    }
}