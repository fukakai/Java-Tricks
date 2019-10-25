import java.util.ArrayList;
import java.util.List;

public class App {
	
	/**
	 * We can call insertElements() with either a List<A>, or a List typed
	 * to a superclass of A
	 * @param args
	 */
	public static void main(String[] args) {
		App app = new App();
		
		List<ClassParent> listClassParent = new ArrayList<ClassParent>();
		app.insertElements(listClassParent);
		System.out.println("List A ="+listClassParent);
		
		
		List<Object> listObject = new ArrayList<Object>();
		app.insertElements(listObject);
		System.out.println("ListObject ="+listObject);
	}
	
	/**
	 * List<? super A> means that the list is typdes to either the A class,
	 * or a superclass of A
	 * 
	 * When you know that the list is typed to either A>, or a superclass of A,
	 * it is safe to insert instances of A or subclasses of A (B or C) into
	 * the list
	 * 
	 * All of the elements inserted here are either A instances, or instances of A's
	 * superclass. Since both B and CD extend A, if A had a superclass, B and C would
	 * also be instances of that superclass
	 * 
	 * https://youtu.be/o9YzJN0-AT4
	 * Java generics: Upper and lower bound
	 * _? extends upper_
	 * _? super lower_
	 * @param list
	 */
	public void insertElements(List<? super ClassParent> list) {
		list.add(new ClassParent());
		list.add(new ChildClassZero());
		list.add(new ChildClassOne());
	}
}
