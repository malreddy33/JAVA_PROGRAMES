import java.util.Scanner;
public class matrix_mul{
    public static void main(String[] args){
        int[][] fir={{1,2,3},{4,5,6},{7,8,9}};
        int[][] sec={{1,2,3},{4,5,6},{7,8,9}};
        int[][] temp=new int[3][3];
        int f1=fir.length;
        int l1=sec.length;
        int i,j,k;
        for (i=0;i<f1;i++){
            for(j=0;j<l1;j++){
                for(k=0;k<l1;k++){
                    temp[i][j] += fir[i][k] * sec[k][j];
                }
            }
        }

        for(int a=0;a<f1;a++){
            for(int b=0;b<f1;b++){
                System.out.print(temp[a][b]+" ");
            }
            System.out.println();

        }

    }
}