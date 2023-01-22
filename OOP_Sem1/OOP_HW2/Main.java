package OOP_Sem1.OOP_HW2;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void Main(String[] args){
        Immutable firstImmutable = new Immutable ("Артем", 31,
                Map.of("Ключ", "Значение"));
        Map<String, String> map = new HashMap<>();
        map.put("accept key", "value");

        System.out.println("Result after modifying");
        myImmutable.getMyMap().put("bad key", "another value");
        myImmutable.getMyMap().keySet().forEach(System.out::println);

        System.out.println("Result of the object's map after modifying the initial map");
        map.put("bad key", "another value");
        myImmutable.getMyMap().keySet().forEach(System.out::println);
    }
}
