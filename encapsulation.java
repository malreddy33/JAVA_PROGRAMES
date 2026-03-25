class mal{
    private int n;

    public int getn(){
        return n;

    }

    public void setb(int a){
        n=a;
    }
}
public class encapsulation {
    public static void main(String[] args){
        mal obj=new mal();
        obj.setb(2000);
        System.out.println(obj.getn());

    }
}
