import java.security.Principal;

class Null_pointer_exception {
    public static void main(String[] args) {
        String a=null;
        try{
            System.out.println(a.toUpperCase());
        }
        catch(NullPointerException e) 
        {
            System.out.print("Null Pointer Exception is Fonud During Run Time ");
        }
    }
    
}
