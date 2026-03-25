class Marks{
    void display(){
        System.out.println("lawda................");
    }
}   

class Dog extends Marks{
    void happy(){
        System.out.println("happy!!!!!!!!!!!!");
    }
}

public class Single_inheritence{
    public static void main(String[] args){
        Dog obj=new Dog();
        obj.display();
        obj.happy();
    }

    
}
