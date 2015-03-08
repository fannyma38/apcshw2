import java.io.*;
import java.util.*;

public class Selection {

    public static int[] flip(int[] A, int B, int C) {
	int t = A[B];
        A[B] = A[C];
	A[C] = t;
	return A;
    }


    public static Object select(int[] A, int k, int low, int high) {
	    int pivot = A[k];
	    A = flip(A, k, high);
	    high--;
	    while (low != high) {
		if (A[low] < pivot) {
		    low++;
		}
		else if (A[low] > pivot) {
		    A = flip(A, low, high);
		    high--;
		}
	    }
	    if (low > k) {
		return select(A, k, 0, pivotIndex - 1);
	    }
	    if (low < k) {
		return select(A, k, pivotIndex + 1, A.length - 1);
	    }
	    if (low == k) {
		return A[k];
	    }
    }

    public static void main(String[] args) {
	Selection s = new Selection();
	int[] array = new int[]{1,2,7,4,3,5,3,5,4,4,3,9};
	System.out.println(select(array, 5, 0, array.length - 1));
    }

}
