public class Exception5 {
    public static void main(String[] args) {
        try{
            int arr[]={5,0,1,2};
            try{
                int x=arr[3]/arr[1];
            }
            catch(ArithmeticException e)
            {
                System.out.println("Divide by zero");
            }
            arr[4]=3;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }
    }
}
