import java.util.Scanner;
public class transpose{
    public static void main(String[] args){
        int[][] arr={{1,2},{3,4}};
        int m=arr.length;
        int[][] trav=new int[m][m];
        

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                trav[j][i]=arr[i][j];
            }
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
            System.out.print(trav[i][j]+" ");

            }

        System.out.println();
        }
    }
}