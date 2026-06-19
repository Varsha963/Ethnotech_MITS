//generic class
class Box<T>
{
    private T content;
    public void add(T content)
    {
        this.content=content;
    }
    public T get()
    {
        return content;
    }
}
public class Generic1
{
    public static void main(String[] args)
    {
        Box<Integer> integerBox=new Box<>();
        integerBox.add(123);
        int intvalue=integerBox.get();
        System.out.println("IntegerValue:"+intvalue);
        Box<String> stringBox=new Box<>();
        stringBox.add("Hello MITS");
        String stringvalue=stringBox.get();
        System.out.println("Stringvalue:"+stringvalue);
    }
}
