package algorithms;

public class QuickSort{
	
	 public void sort(double[] niz, int lijevi, int desni) {
	        if (lijevi < desni) {
	            int pivotIndex = partition(niz, lijevi, desni);
	            sort(niz, lijevi, pivotIndex - 1);
	            sort(niz, pivotIndex + 1, desni);
	        }
	    }
	 
	 public static int partition(double[] niz, int lijevi, int desni) {
	        double pivot = niz[desni];
	        int i = lijevi - 1;
	        for (int j = lijevi; j < desni; j++) {
	            if (niz[j] < pivot) {
	                i++;
	                double temp = niz[i];
	                niz[i] = niz[j];
	                niz[j] = temp;
	            }
	        }
	        double temp = niz[i + 1];
	        niz[i + 1] = niz[desni];
	        niz[desni] = temp;
	        return i + 1;
	    }
}
