package Core_Java;

import java.util.*;

public class MedicalShop1 {
    
    static Stack<Details> stack = new Stack<>();

    public static Details enterDetails() {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        final String id = scanner.nextLine();

        System.out.print("Enter name: ");
        final String name = scanner.nextLine();

        System.out.print("Enter age: ");
        final int age = scanner.nextInt();

        System.out.print("Disease name: ");
        final String diseasename = scanner.nextLine();

        System.out.print("Enter your phone no: ");
        final String phoneno = scanner.nextLine();

        System.out.print("Enter your doctor fee: ");
        final int fee = scanner.nextInt();

        final Details d = new Details();
        d.setAge(age);
        d.setDisease_Name(diseasename);
        d.setId(id);
        d.setName(name);
        d.setPhone_No(phoneno);
        d.setAmount(fee);
        // stack.push(data);
        // System.out.println(data);

        scanner.close();
        return d;
    }

    public static void main(String[] args) {

        try  {
            final Details d = enterDetails();

            System.out.println(d);
    
    
            stack.push(d);
        } catch(final Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    
}


class Details {
    String id;
    String name;
    int age;
    String disease_Name;
    String phone_No;
    int amount;
    public Details() {
    }
    
    public String getId() {
        return id;
    }
    public void setId(final String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(final int age) {
        this.age = age;
    }
    public String getDisease_Name() {
        return disease_Name;
    }
    public void setDisease_Name(final String disease_Name) {
        this.disease_Name = disease_Name;
    }
    public String getPhone_No() {
        return phone_No;
    }
    public void setPhone_No(final String phone_No) {
        this.phone_No = phone_No;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(final int amount) {
        this.amount = amount;
    }

    

}

