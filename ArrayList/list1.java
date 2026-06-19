import java.util.ArrayList;
import java.util.List;
public class list1 {
    public static void main(String[] args)
    {
        List<String> fruits=new ArrayList<>();
        fruits.add("aaa");
        fruits.add("bbb");
        fruits.add("aaa");
        fruits.add(1,"ccc");
        String firstfruit=fruits.get(0);
        for(String fruit:fruits)
        {
            System.out.println(fruit);
        }
        List<String> wishlist=List.of("Phone case","screen protector");
        fruits.addAll(wishlist);
        System.out.println(fruits);
        System.out.println("Fruits size:"+fruits.size());
        System.out.println("If list is empty:"+fruits.isEmpty());

    }
}
