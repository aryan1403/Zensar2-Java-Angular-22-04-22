package Basics;

public class conditionalStatements {
    public static void main(String[] args) {
        int value = 500;

        // value > 200 = expensive : cheap
        // if -> true = execute the if block
        // if -> false = don't execute the if block -> else block

        // value > 200 value <= 500
        // Range = (200, 500)

        // || = or -> atleast 1 condition should be true
        // && = and -> all the condition should be true
        if(value > 200 || value <= 500) {
            System.out.println("Item is Expensive");
        } else {
            System.out.println("Item is Cheap");
        }
    }
}
