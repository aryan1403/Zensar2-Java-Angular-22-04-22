package Core_Java.Assignment2;

public class halfreverseeven {
    public static String reverse(String half) {
        String s = "";
        for (int i = half.length()-1; i >= 0; i--) {
            s += half.charAt(i);
        }
        return s;
    }
    public static String removeEven(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if(i % 2 != 0) {
                s += str.charAt(i);
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "Aaryan";

        String half = str.substring(0, str.length()/2);
        str = str.replace(half, reverse(half));
        // Aaryan
        // half :- Aar
        // reverse(half) :- raA
        // raAyan
        // removeEven() -> rAa
        System.out.println(removeEven(str));


    }
}
