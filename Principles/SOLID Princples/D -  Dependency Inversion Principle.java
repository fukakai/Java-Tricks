/**
* Both should depend on abstractions.
* Rule 1: High-level modules should not depend on low-level modules.
* RUle 2: Abstractions should not depend on details.
*/
/**
* #########################################################
* #################### Rule Violation #####################
* #########################################################
*/
public class BackEndDeveloper {
    /** First rule Violation */
    public void writeJava() {}
}
public class FrontEndDeveloper {
    /** First rule Violation */
    public void writeJavascript() {}
}
public class Project {
    /** Second rule Violation */
    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
    public void implement() {
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }
}
/**
* #########################################################
* ######################### Rule ##########################
* #########################################################
*/
public interface Developer {
    void develop();
}
public class BackEndDeveloper implements Developer {
    @Override
    public void develop() {
        writeJava();
    }
    private void writeJava() {}
}

public class FrontEndDeveloper implements Developer {
    @Override
    public void develop() {
        writeJavascript();
    }
    public void writeJavascript() {}
}
public class Project {
    private List<Developer> developers;
    public Project(List<Developer> developers) {
        this.developers = developers;
    }
    public void implement() {
        developers.forEach(d->d.develop());
    }
}
Details should depend on abstractions.