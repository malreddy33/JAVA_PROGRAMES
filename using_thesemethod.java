public class using_thesemethod {

    String name;
    int marks;
    using_thesemethod(String n,int m){
       String name = n;
       int  marks=m;

    }
    void display(){
        System.out.println( name +" "+marks);
    }

    public static void main(String[] args){
        using_thesemethod obj=new using_thesemethod("malreddy",97);
        obj.display();
    }
}
