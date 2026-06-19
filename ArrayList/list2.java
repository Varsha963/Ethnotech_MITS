import java.util.List;
import java.util.ArrayList;
public class list2 {
    public static void main(String[] args) {
        List<String>cart=new ArrayList<>();
        cart.add("Laptop");
        cart.add("Smartphone");
        cart.add(1,"tab");
        System.out.println("Cart1"+cart);
        cart.set(2,"Smartphonepro");
        System.out.println("Cart set:"+cart);
        cart.replaceAll(item->"SALE_"+item);
        System.out.println("cart replace:"+cart);
    }
}
