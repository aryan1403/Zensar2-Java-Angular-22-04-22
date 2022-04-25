package Basics;

public class Ball {
    String material;
    String color;
    double price;

    public Ball(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "color=" + color + "\nmaterial=" + material + "\nprice=" + price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}

class meow {
    public static void main(String[] args) {
        Ball b = new Ball("Leather", "Red", 100);
        Ball b1 = new Ball("Jumper", "Yellow", 20);

        System.out.println(b.getMaterial());
        System.out.println(b.getColor());
        System.out.println(b.getPrice());
        System.out.println(b1);
    }
}
