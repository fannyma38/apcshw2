import java.util.ArrayList;
import java.util.Random;

public class Mergesort{

    // merge- combine deck a and b into omega in order
    
    public static ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b) {
       
	ArrayList<Integer> omega = new ArrayList<Integer>();
	
	while (! (a.isEmpty() || b.isEmpty())) {
	    if (a.get(0) > b.get(0)) {
		omega.add(b.get(0));
		b.remove(0);
	    } else { 
		omega.add(a.get(0));
		a.remove(0);
	    }
	}

	omega.addAll(a);
	omega.addAll(b);

	return omega;
	
    }
}

public static void main(String args[]) {
    
	//Merge Testing

	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(3);
	a.add(8);

	ArrayList<Integer> b = new ArrayList<Integer>();
	b.add(2);
	b.add(7);
	b.add(10);
	ArrayList<Integer> ret = Mergesort.merge(a, b);

	System.out.println(ret);

    }
}
