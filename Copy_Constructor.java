class A
{
    int a; 
    String b;
    A()
    {
        a=10; b="Learn Coding";
        System.out.println(a + "  "+ b);
    }
    A( A ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a + "  "+ b + "copy");


    }
}



class Copy_Constructor {

    public static void main(String[] args)
    {
        A r = new A();
        A r2 =new A(r);
         
    }
    
}
