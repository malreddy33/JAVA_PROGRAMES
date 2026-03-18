import java.util.Scanner;
public class Strong_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o=n;
        int m;
        int sum=0;

        while(n>0){
            m=n%10;
            int fact=1;
            for(int i=1;i<=m;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n/=10;
        }

        if(o == sum){
            System.out.println("Strong number");
        }else{
            System.out.println("Not Strong number");
        }
        
    }
    
}
