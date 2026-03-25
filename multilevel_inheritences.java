class Animal{
    void bark(){
        System.out.println("barking");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("yaho...........");
    }
}
class Pig extends Dog{
    void colour(){
        System.out.println("black..........!");
    }
}

public class multilevel_inheritences {
    
    public static void main(String[] args){   
        Pig obj=new Pig();
        obj.sound();
        obj.bark();
        obj.colour();

    }
}

