package algorithms;

public class InsertionSort {

	public static void sort(int[] niz) {
		
		for(int i = 1; i < niz.length; i++){
			
			int j = i;	
			
			while(j > 0 && niz[j - 1] > niz[j]){
				
				int pom = niz[j - 1];			               
				niz[j - 1] = niz[j];			               
				niz[j] = pom;               
				j--;
			}
		}
			  
	}
}
