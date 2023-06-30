class A {
    void shap()
    {
        System.out.println(" Not Declear Shap Size");
    }
    
}
class B extends A
{
    @Override
    void shap()
    {
        System.out.println("Square Is Defind");
    }
}

class Method_Overiding_poly
{
    public static void main(String[] args) { 
       A r= new B();
        r.shap();

    }
}
