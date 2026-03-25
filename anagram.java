import java.util.Scanner;
public class anagram {
    public static void main(String[] args){
        String str1="silent";
        String str2="listeb";

        if(str1.length() != str2.length()){
            System.out.print("not anagram");
            return;
        }

        char[] s2=str2.toCharArray();

        int count=0;


        for(int i=0;i<str1.length();i++){
            for(int j=0;j<s2.length;j++){
                if(str1.charAt(i) == s2[j]){
                    s2[j] = ' ';
                    count++;
                    break;

                }
            }
        }

        if(count == str1.length()){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }
    }
    
}
