import java.util.Scanner;

/**
 * Raju
 */
 interface client {

    void input();
    void output();

}
class Raju implements client{
    String name; double sal;
    public void input()
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter The Name");
        name=r.nextLine();

        System.out.println("Enter the Salary");
        sal=r.nextDouble();
    }
    public void output()
    {
        System.out.println(name + " " + sal);
    }

    public static void main( String[] args)
    {
    client c = new Raju();
    c.input();c.output();
    }

}

