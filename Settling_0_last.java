import java.util.Scanner;
public class Settling_0_last {
    public static void main(String[] args) {
        
        
        int[] arr={30,10,5,0,3,0,7};
        int n=arr.length;
        int[] ex=new int[n];
        int in=0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                ex[in]=arr[i];
                in++;
            }
        }
    
    for(int i =0;i<n;i++){
        System.out.print(ex[i]+" ");
    }
    }
    
}
