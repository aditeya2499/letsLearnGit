import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0,1);
        l1.add(2);
        l1.add(3);
        l1.forEach(i -> System.out.println(i));
    }
}
