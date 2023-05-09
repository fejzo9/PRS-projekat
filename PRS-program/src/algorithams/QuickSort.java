package algorithams;

public class QuickSort {
	
	 public static void sort(int[] niz, int lijevi, int desni) {
	        if (lijevi < desni) {
	            int pivotIndex = partition(niz, lijevi, desni);
	            sort(niz, lijevi, pivotIndex - 1);
	            sort(niz, pivotIndex + 1, desni);
	        }
	    }
	 
	 public static int partition(int[] niz, int lijevi, int desni) {
	        int pivot = niz[desni];
	        int i = lijevi - 1;
	        for (int j = lijevi; j < desni; j++) {
	            if (niz[j] < pivot) {
	                i++;
	                int temp = niz[i];
	                niz[i] = niz[j];
	                niz[j] = temp;
	            }
	        }
	        int temp = niz[i + 1];
	        niz[i + 1] = niz[desni];
	        niz[desni] = temp;
	        return i + 1;
	    }
}
