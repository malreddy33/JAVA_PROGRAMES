import java.util.Scanner;
public class covert_lowcase_highcase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2="";

        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);

            if(ch>='a' && ch<='z'){
                str2 = str2+(char)(ch-32);
            }else{
                str2=str2+ch;
            }
        }
        System.out.println(str2);
          
    }
    
}
