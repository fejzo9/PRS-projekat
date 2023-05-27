package algorithms;

public class InsertionSort {

	public static void sort(int[] niz, int lijevi, int desni) {
		
		 for (int i = lijevi + 1; i < desni + 1; i++) {
			 
			 int j = i;
			 
               while(j > lijevi && niz[j - 1] > niz[j]) {
            	   int pom = niz[j - 1];
            	   niz[j - 1] = niz[j];
            	   niz[j] = pom;
            	   j--;
               }
			}
			  
	}
}
