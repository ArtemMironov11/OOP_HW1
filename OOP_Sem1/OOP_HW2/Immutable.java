package OOP_Sem1.OOP_HW2;

import java.util.HashMap;
import java.util.Map;

public final class Immutable {
    private String name;
    private int age;


    public Immutable (String name, int age, Map<String, String> FindMap){
        this.name = name;
        this.age = age;
        Map<String, String> FindMap = new HashMap<>();
        for (String key: FindMap.keySet()) {
            deepCopy.put(key, FindMap.get(key));
        }
        this.FindMap = FindMap;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Map<String, String> getFindMap{
        return FindMap;
    }
}
