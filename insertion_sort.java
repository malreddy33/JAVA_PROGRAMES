import java.util.Scanner;
public class insertion_sort {
    public static void main(String[] args){
        int[] arr={8,3,6,4,2,8,9,4};
        int n=arr.length;

        for(int i=1;i<n;i++){
            int k=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=k;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
