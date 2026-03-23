import java.util.Scanner;
public class second_largest {
    public static void main(String[] args){
        int[] l={10,20,30,40,50};
        int m=l.length;
        int larg=l[0];
        int sec=l[1];
        if(l[0]>l[1]){
            larg=l[0];
            sec=l[1];
        }else{
            larg=l[1];
            sec=l[0];
        }

        for(int i=2;i<m;i++){
            if(l[i]>larg){
                sec=larg;
                larg=l[i];
            }else if(l[i]>sec && l[i]!=larg){
                sec=l[i];
            }
        }
        System.out.println(larg );
        System.out.println(sec);
    }
}
