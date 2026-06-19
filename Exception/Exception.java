import java.util.Scanner;

class Exception
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try
        {
            int c=a/b;
            System.out.println("Result is:" +c);
        }
        catch (ArithmeticException e) { 
            System.out.println("Cannot divide by zero!");
        }
    }
}

