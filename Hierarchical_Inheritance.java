class school{
    void strength(){
        System.out.println("there are 20 stundents");
    }
}
class college extends school{
    void marks(){
        System.out.println("exam for 100 marks");
    }
}
class university extends school{
    void cgp(){
        System.out.println("average cgp is 8.5%");
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args){
        university obj=new university();
        college obj2=new college();
        obj.cgp();
        obj.strength();
        obj2.marks();

    }

    
}
