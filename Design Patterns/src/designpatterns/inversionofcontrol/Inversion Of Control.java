package designpatterns.inversionofcontrol;

//Your standard code would look something like this:
public class TextEditor {

    private SpellChecker checker;

    public TextEditor() {
        this.checker = new SpellChecker();
    }
}

//In an IoC scenario we would instead do something like this:
public class TextEditor {

    private IocSpellChecker checker;

    public TextEditor(IocSpellChecker checker) {
        this.checker = checker;
    }
}

//This allows us to call the dependency then pass it to the TextEditor class like so:
SpellChecker sc = new SpellChecker; // dependency
TextEditor textEditor = new TextEditor(sc);

//With spring
public class TextEditor {

    @Autowire
    private IocSpellChecker checker;

    //rest of the class
}
