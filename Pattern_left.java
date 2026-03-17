import java.util.Scanner;
public class Pattern_left {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int row=5;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("* ");

            }
            System.out.print("\n");
        }
    }
    
}
