import java.util.ArrayList;
import java.util.Random;

public class Mergesort2{
    public static int[] mergeSort(int[] data) {
	    if (data.length() == 1) {
			return data;
		}

		else {
		    int[] A = new int[data.length()/2];
		    int[] B = new int[data.length()/2];

			for (int i = 0 ; i < data.length() / 2 ; i++) {
			    A[i]=data[i];
			}
			for (int i = data.length() / 2 ; i < data.length() ; i++) {
			    B[i]=data[i];
			}

			int[] AS  = mergeSort(A);
			int[] BS = mergeSort(B);
			return merge(AS, BS);
		}
	}
    
    public static ArrayList<Integer> merge(int[] A, int[]B) {
       
	ArrayList<Integer> omega = new ArrayList<Integer>();
	
        int[]ret= new int[A.length() + B.length()];
	int Bcoun= 0;
	int Acoun=0;
	for (int counter=0; counter < int.length(); counter++){
	    if (A[Acoun] > B[Bcoun]){
		ret[counter] = A[Acoun];
		Acoun++;
	    }
	    else {
		ret[counter] = B[Bcoun];
		Bcoun++;
	    }
	}	
	return ret;
    }
}

public static void main(String args[]) {
    int[] a = new int[4];
    a[0] = 2;
    a[1] = 6;
    a[2] = 0;
    a[3] = 9;
    int[] ret = mergeSort(a);

    System.out.println(ret);

}
