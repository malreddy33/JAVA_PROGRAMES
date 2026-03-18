import java.util.Scanner;
public class Perfect_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o=n;
        int sum=0;

        for(int i=1;i<n;i++){
            if(n%i == 0){ 
                sum =sum+i;
            }
        }
        if(o == sum){
            System.out.println("Perfect");
        }else{
            System.out.println("Not Perfect");
        }
    }    

}
