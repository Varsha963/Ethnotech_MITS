public class Exception7 {
    public static void main(String[] args) {
        validate(13);
        System.out.println("Rest of the code");
    }
    static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("not eligilble for vote");
        }
        else{
            System.out.println("Welcome to vote");               
        }
    }
}
