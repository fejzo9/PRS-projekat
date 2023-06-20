package algorithms;

public class SelectionSort {

	public static void sort(int[] niz, int lijevi, int desni) {
	
		 for (int i = lijevi; i < desni; i++) {
			 int min = i;
               for(int j = i + 1; j < desni + 1; j++) {
            	   if(niz[j] < niz[min])
            		   min = j;
               }
               
				int pom = niz[min];
				niz[min] = niz[i];
				niz[i] = pom;
			}
	}
}

