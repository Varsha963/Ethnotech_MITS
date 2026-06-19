public class Exception3 {
    public static void main(String[] args) {
        try{
            Class.forName("Class1");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println();
            System.out.println("Class Not Found");
        }
    }    
}
