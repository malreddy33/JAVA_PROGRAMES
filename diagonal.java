import java.util.Scanner;
public class diagonal {
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<m;i++){
            System.out.print(arr[i][i]+" ");
        }

        System.out.println("\n");
        for(int i=0;i<m;i++){
            System.out.print(arr[i][n-1-i]+" ");
        }

    System.out.println();
    }
    
}
