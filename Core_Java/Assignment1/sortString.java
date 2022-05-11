package Core_Java.Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortString {
    public static String sort(String str) {
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < str.length(); index++) {
            int n = str.charAt(index); // ASCII
            list.add(n);
        }
        Collections.sort(list);
        String newstr = "";
        for (int i : list) {
            newstr += (char) i;
        }
        return newstr;
    }
    public static void main(String[] args) {
        System.out.println(sort("Aaryan"));
    }
}
