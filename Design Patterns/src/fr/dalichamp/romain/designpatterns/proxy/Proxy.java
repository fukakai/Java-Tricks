public interface ExpensiveObject {
    void process();
}
public class ExpensiveObjectImpl implements ExpensiveObject {
 
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }
     
    @Override
    public void process() {
        LOG.info("processing complete.");
    }
     
    private void heavyInitialConfiguration() {
        LOG.info("Loading initial configuration...");
    }
     
}
public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;
 
    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
public static void main(String[] args) {
    ExpensiveObject object = new ExpensiveObjectProxy();
    object.process();
    object.process();
}

/** Result:
Loading initial configuration...
processing complete.
processing complete.
*/
