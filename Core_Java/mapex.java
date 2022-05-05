package Core_Java;

import java.util.HashMap;
import java.util.Map;

public class mapex {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); 
        System.out.println("Map is empty : " + map.isEmpty());

        map.put("Aaryan", 12345);
        map.put("Arush", 123);
        map.put("Aaryan", 999);

        System.out.println("Map is Empty : " + map.isEmpty());

        System.out.println("Key : Aaryan, Value : " + map.get("Aaryan"));
        System.out.println("Key : Arush, Value : " + map.get("Arush"));

        System.out.println("Key : Arya is there ? " + map.containsKey("Arya"));
        System.out.println("Value : 123 is there ? " + map.containsValue(123));

        map.remove("Arush");
        System.out.println("Key : Arush removed");

        map.put("Neha", 12345678);

        map.forEach((k, v) -> {
            System.out.println("Key : " + k + ", value : " + v);
        });

    }
}
