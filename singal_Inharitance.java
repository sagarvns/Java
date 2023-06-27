class Student
{
    int roll_no,mark;
    String name;
    void input()
    {
        System.out.println("Enter the Roll No Mark and Student name");
    }
}

class singal_Inharitance extends Student {
    void display()
    {
        roll_no=22;name="Anu Yadav";mark=97;
        System.out.println(name +"  "+ roll_no + "  " + mark + "  ");
    }
    public static void main(String[] args) {
        singal_Inharitance r = new singal_Inharitance();
        r.input();r.display();

    }
    
}
