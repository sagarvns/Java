class Method_Overloading_poly {
    void adds()
    {
        int a=20,b=80,c;
        c=a+b;
        System.out.println("result  is  ="+c);
    }
    void adds(int x, int y)
    {
        int c;
        c=x+y;
        System.out.println("result  is  ="+c);
    }
    void adds(int x ,double y)
    {
        double c;
        c= x+y;
        System.out.println("result  is  ="+c);
    }
    public static void main(String[] args) {

        Method_Overloading_poly r=new Method_Overloading_poly();
        r.adds();
        r.adds(43, 45.99);
        r.adds(45,67);

        
    }
    
}
