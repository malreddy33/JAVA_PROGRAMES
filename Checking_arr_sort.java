import java.util.Scanner;
public class Checking_arr_sort {
    public static void main(String[] args) {
        
           
        int[] arr={3,8,4,2,5};
        int n=arr.length;
        int flag=1;
        for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    flag=1;
                    break;
                }   
            }
            
        if(flag == 1){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
