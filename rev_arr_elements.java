import java.util.Scanner;
public class rev_arr_elements {
    public static void main(String[] args){
        int[] m={10,20,30,40,50};
        int n=m.length;
        int[] a=m.clone();
        int i;
        int j;
        for(i=n-1;i>=0;i--){
            System.out.print(m[i]+" ");
        }
        System.out.print("\n");
        for(i=0;i<=n-1;i++){
            System.out.print(m[i]+" ");
        }

        //swaping of numbers in array to reverse
        System.out.print("\n\n");
        for(i=0;i<=n/2;i++){
            int temp=m[i];
            m[i]=m[n-1-i];
            m[n-1-i]=temp; 
        }
        for(int k=0;k<=n-1;k++){
            System.out.print(m[k]+" "); 
            
        }
        System.out.print("\n");
        for(i=0;i<=n-1;i++){
            System.out.print(a[i]+" ");
        }

    }
    
}
