class A
{
    int a; String b; boolean c;
    // A()
    // {
    //     a=100; b="Sagar"; c=true;
    // }
    void Disp()
    {
        System.out.println(a + " " + b + " " + c);
    }
}

class default_Constructor {

    public static void main( String[] args )
    {
        A r;
        r=new A();
        r.Disp();

    }

    
}
