package designpatterns.factory;

public class England implements Country {
    @Override
    public void name() {
        System.out.println("England");
    }

    @Override
    public void language() {
        System.out.println("English");
    }
}
