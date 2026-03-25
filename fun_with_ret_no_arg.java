import java.util.Scanner;
public class fun_with_ret_no_arg {

    public int add(){
        int a=5,b=4;
        return a+b;
    }


    public static void main(String[] args){
        fun_with_ret_no_arg obj=new fun_with_ret_no_arg();
        int s=obj.add();
    System.out.println(s);
    }
}
