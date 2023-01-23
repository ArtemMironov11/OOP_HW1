package OOP_HW2;

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main (String[] args){
        Immutable firstImmutable = new Immutable ("Артем", 31,
                Map.of("Ключ", "Значение"));

        Map<String, String> map = new HashMap<>();
        map.put("accept key", "value");

        System.out.println("Result after modifying");
        map.put("bad key", "another value");
        firstImmutable.getFindMap().keySet().forEach(System.out::println);

        System.out.println("Result of the object's map after modifying the initial map");
        map.put("bad key", "another value");
        firstImmutable.getFindMap().keySet().forEach(System.out::println);
    }
}
