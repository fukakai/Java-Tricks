import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppSecond {
	/**
	 * replacing extends with their super includes also integers
	 * @param args
	 */
	public static void main(String[] args) {
		//List<? extends Integer> list = new ArrayList<>();
		//List<? super Integer> list = new ArrayList<>();
		List<? super Number> list = new ArrayList<>();
		list.add(1); //super Integer & super Number
		list.add(10.0F); //super Number
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
