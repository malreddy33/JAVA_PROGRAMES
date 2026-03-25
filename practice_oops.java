class car{
    void style(){
        System.out.println("chaloo!!!!!!!!!.");
    }
}

class bike extends car{
    void speed(){
        System.out.println("hign speeeeeeeeeeeed.");
    }
}

class bus extends car{
    void model(){
        System.out.println("yahoooooo!!!!!!!!!!!!!!");
    }
}
class scooter extends bike{
    void happy(){
        System.out.println("someeeeeeeee!!!!!!!!!");
    }
}

public class practice_oops{
    public static void main(String[] args){
        bus obj=new bus();
        scooter obj2=new scooter();
        obj.model();
        obj.style();
        obj2.speed();
        obj2.happy();

    }
}