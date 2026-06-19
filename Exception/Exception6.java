public class Exception6 {
    public static void main(String[] args) {
        try{
            String st=null;
            st.length();
            int data=25/5;
            System.out.println(data);
        }
        catch(NullPointerException e)
        {
            System.out.println("Null pointer error"+e);
        }
        finally{
            System.out.println("Finally block of the code");
        }
        System.out.println("Rest of the code");
    }   
}
