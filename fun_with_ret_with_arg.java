import java.util.Scanner;
public class fun_with_ret_with_arg {


    public static int add(int a,int b){
        return a+b;
    }
    
    public static void main(String[] args){
        fun_with_ret_with_arg object = new fun_with_ret_with_arg();
        int a=5,b=6;
        int c=object.add(a,b);
        System.out.println(c);
 
    }
} 