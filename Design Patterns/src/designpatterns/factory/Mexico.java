package designpatterns.factory;

public class Mexico implements Country {

    @Override
    public void name() {
        System.out.println("Mexico");
    }

    @Override
    public void language() {
        System.out.println("Spanish");
    }
}
