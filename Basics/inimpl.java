package Basics;

public class inimpl implements inex {

    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }

    @Override
    public void dance() {
        System.out.println("Dancing");
    }

    public static void main(String[] args) {
        new inimpl().hello();
        new inimpl().dance();
        new inimpl().talk();
    }
    
}
