abstract class Parant{
    Parant()
    {
        System.out.print("Constructor Of Parant ");
    }
    void sayhellwo(){
        System.out.println("Hellwo World");
    }

    abstract public void greet();
}
class Child2 extends Parant{
    public void greet(){
        System.out.println("Good Morning");
        System.out.println("Good Evening");
        System.out.println("Good Night");
    }

}


class Abstract {
    public static void main(String [] args)
    {
        Child2 r =new Child2();
    }
    

}
