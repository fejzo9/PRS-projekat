package algorithms;

public class SelectionSort {

	public static void sort(int[] niz) {
	
		for(int i = 0; i < niz.length - 1; i++){
            
			int min = i;
			            
			for(int j = i + 1; j < niz.length; j++){			                
				if(niz[j] < niz[min])
					min = j;
			       }
			
				int pom = niz[min];
				niz[min] = niz[i];
				niz[i] = pom;
		}
	}
}

