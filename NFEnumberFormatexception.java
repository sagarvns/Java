 class NFEnumberFormatexception{
    public static void main(String[] args) {
        String str="Sagar";
        try{
            int a=Integer.parseInt(str);
            System.out.println(a);
            System.out.println("String Number Format Exception");
        }
        catch(NumberFormatException e)
        {
            System.out.println("String" + str + "can't be Converted To Integer ");
        }
    }
}
