public interface Strategy {
    public void doSomething();
}

public class Context() {
    private Strategy strategy;
    // we set the strategy in the constructor
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void executeTheStrategy() {
        this.strategy.doSomething();
    }
}


public class Strategy1 implements Strategy {
    public void doSomething() {
        System.out.println(“Execute strategy 1”);
    } 
}
public class Strategy2 implements Strategy {
    public void doSomething() {
        System.out.println(“Execute strategy 2”);
    } 
}

public class Demo() {
    public static void main(String[] args) {
        Context context = new Context(new Strategy1()); // we inject the Strategy1
        context.executeTheStrategy();  // it will print “Execute strategy 1”;
        context = new Context(new Strategy2());  // we inject the Strategy2
        context.executeTheStrategy();  // it will print “Execute strategy 2”
    }
}