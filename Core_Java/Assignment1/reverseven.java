package Core_Java.Assignment1;

public class reverseven {
    public static String reverse(String s) {
        String str = "";
        // length - 0
        for (int i = s.length() - 1; i >= 0; i-=2) {
            str += s.charAt(i);
        }

        /* for (int i = 0; i < str.length(); i++) {
            if(i % 2 == 0) {
                s = s.replace(s.charAt(i)+"", "");
            }
        } */
        return str;
    }
    public static void main(String[] args) {
        System.out.println(reverse("Aaryan"));
    }
}
