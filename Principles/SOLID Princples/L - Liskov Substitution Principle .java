public class Bird{
    public void fly(){}
}
public class Duck extends Bird{}

/**
* Ostrich is a bird, But it can't fly, Ostrich class is a subtype of class Bird, But it can't use the fly method, that means that we are breaking LSP principle.
*/
public class Ostrich extends Bird{}