import java.util.Scanner;
public class string_vowels {
    public static void main(String[] args){
        String str="hello";
        int l=str.length();
        String vowel="aeiouAEIOU";
        int g=vowel.length();
        for(int i=0;i<l;i++){
            for(int j=0;j<g;j++){
                if (str.charAt(i) == vowel.charAt(j)){
                    System.out.print(str.charAt(i)+" ");
                }
            }
        }
    }
}
