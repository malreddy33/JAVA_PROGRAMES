public class default_constructer {


    default_constructer(){ 
        System.out.println("world");

    }  

    void display(){
        System.out.println("happy");
    }

    public static void main(String[] args){
        default_constructer obj=new default_constructer();
        obj.display();

    }
}
