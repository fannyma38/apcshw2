import java.util.ArrayList;
import java.util.Random;

public class Mergesort{
       	public static ArrayList<Integer> mergeSort(ArrayList<Integer> data) {
	    if (data.size() == 1) {
			return data;
		}

		else {
			ArrayList<Integer> A = new ArrayList<Integer>();
			ArrayList<Integer> B = new ArrayList<Integer>();

			for (int i = 0 ; i < data.size() / 2 ; i++) {
				A.add(data.get(i));
			}
			for (int i = data.size() / 2 ; i < data.size() ; i++) {
				B.add(data.get(i));
			}

			ArrayList<Integer> AS = mergeSort(A);
			ArrayList<Integer> BS = mergeSort(B);
			return merge(AS, BS);
		}
	}
    
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
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(3);
	a.add(8);
	a.add(2);
	a.add(7);
	a.add(10);
	ArrayList<Integer> ret = mergeSort(a);

	System.out.println(ret);

}
