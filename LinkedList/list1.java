import java.util.LinkedList;
public class list1 {
    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("Bike");
        list.add("Car");
        list.add("Thar");
        list.add("Zeep");
        list.add("Cycle");
        for(String name:list)
        {
            System.out.println(name+" ");
        }
        System.out.println(list);
    }
    
}
