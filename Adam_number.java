import java.util.Scanner;
public class Adam_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

        int m=n*n;//
        System.out.println(m);

        int d=n;
        int rev=0;
        while(d>0){
            rev=rev*10+(d%10);
            d /=10;
        }
        System.out.println(d);
        int p=d*d;
        System.out.println(p);

        int d1=p;
        int rem=0;
        while(d1>0){
            d1=p%10;
            rem=rem*10+d1;
            p /=10;
        }
        

        if(p==m){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    
}
