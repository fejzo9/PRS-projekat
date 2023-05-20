package algorithams;

public class MergeSort {

	public static void sort(int[] niz, int lijevi, int desni) {
	    if (lijevi < desni) {
	        
	        int srednji = (lijevi + desni) / 2;

	        // Sortiramo prvu i drugu polovicu
	        sort(niz, lijevi, srednji);
	        sort(niz, srednji + 1, desni);

	        // Spajamo sortirane polovice
	        merge(niz, lijevi, srednji, desni);
	    }
	}
	
	public static void merge(int[] niz, int lijevi, int srednji, int desni) {
	    // Velicine dva podniza koji ce se spojiti
	    int n1 = srednji - lijevi + 1;
	    int n2 = desni - srednji;

	    /* Kreiranje pomocnih nizova */
	    int[] L = new int[n1];
	    int[] D = new int[n2];

	    /* Upisujemo podatke u nove nizove */
	    for (int i = 0; i < n1; ++i)
	        L[i] = niz[lijevi + i];
	    for (int j = 0; j < n2; ++j)
	        D[j] = niz[srednji + 1 + j];

	    /* Spajamo podnizove */

	    int i = 0, j = 0;
	    int k = lijevi;
	    
	    while (i < n1 && j < n2) {
	        if (L[i] <= D[j]) {
	        	niz[k] = L[i];
	            i++;
	        }
	        else {
	        	niz[k] = D[j];
	            j++;
	        }
	        k++;
	    }

	    /* Upisujemo ostale elemente iz L[] ako su ostali */
	    while (i < n1) {
	    	niz[k] = L[i];
	        i++;
	        k++;
	    }

	    /* Upisujemo ostale elemente iz D[] ako su ostali */
	    while (j < n2) {
	    	niz[k] = D[j];
	        j++;
	        k++;
	    }
	}
}
