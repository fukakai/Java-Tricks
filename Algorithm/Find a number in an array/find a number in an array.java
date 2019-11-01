// Java code below
import java.util.Arrays;

class A {

    static boolean exists(int[] ints, int k) 
	//binarySearch retourne l'index du fichier
		int result=Arrays.binarySearch(ints,k);
		if(result>=0) return true; return false;
	}
}