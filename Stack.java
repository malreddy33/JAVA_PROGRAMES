import java.util.*;
public class Stack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] stac=new int[n];
        for(int i=0;i<n;i++){
            stac[i]=sc.nextInt();
        }  
        for(int i=0;i<n;i++){
            System.out.print(stac[i]+" ");

        }

    }
    
}
