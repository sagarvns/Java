class A {
    int a=8,b=4,c;
    void add(){
        c=a+b;
        System.out.println("Result of addition =  "+ c); 
    }
    void sub(){
        c=a-b;
        System.out.println("Result of Substraction =  "+ c); 
    }
}

class B extends A 
{
    void Mutiplication(){
        c=a*b;
        System.out.println("Result of Multipliction =  "+ c); 
    }

}

class C extends B 
{
    void Division (){
        c=a%b;
        System.out.println("Result of Division =  "+ c); 
    }

}

class multilevel_inharitance extends C {

    void Squar(){
        c=a*a;
        System.out.println("Result of Square =  " + c); 
    }

    public static void main(String[] args) {
        multilevel_inharitance r =new multilevel_inharitance();
        r.add();
        r.sub();
        r.Mutiplication();
        r.Division();
        r.Squar();
        
    }
    
}
