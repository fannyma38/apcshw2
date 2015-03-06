import java.io.*;
import java.util.*;

public class Selection {
    public static int[] partition(int[] L, int SI, int EI) {
	int[] D = new int[L.length];
	for (int i = 0; i <SI; i++) {
	    D[i] = L[i];
	}
	for (int i = EI + 1; i < L.length; i++) {
	    D[i] = L[i];
	}
	int pivot = L[SI];
	//start sorting starting with number right of pivot
	SI= SI + 1;
	for (int i = SI; i < EI; i++) {
	    if (L[i] < pivot) {
		D[SI] = L[i];
		SI++;
	    }
	    else if (L[i] > pivot) {
		D[EI] = L[i];
		EI--;
	    }
	} 
	D[SI] = pivot;
	return D;
    }

    public static void main(String[] args) {
	Selection s = new Selection();
	int[] array = new int[]{8,4,2,5,7,4,2,32};
    }
}
