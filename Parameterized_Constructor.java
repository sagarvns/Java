class A{
    int x,y;
    A(int a, int b)
    {
        x=a;
        y=b;
    }
    void result()
    {

        System.out.println(x + "  " + y);      

    }
}

class Parameterized_Constructor 
{
    public static void main(String[] args)
    {
    A r=new A(100, 200);
    r.result();
    }
    
}
