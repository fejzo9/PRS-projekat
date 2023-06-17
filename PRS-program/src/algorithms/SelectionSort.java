package algorithms;

public class SelectionSort <T extends Comparable<T>> implements Sort<T>{

	@Override
	public void sort(T[] niz, int lijevi, int desni) {
	
		 for (int i = lijevi; i < desni; i++) {
			 int min = i;
               for(int j = i + 1; j < desni + 1; j++) {
            	   if(niz[j].compareTo(niz[min]) < 0)
            		   min = j;
               }
               
				T pom = niz[min];
				niz[min] = niz[i];
				niz[i] = pom;
			}
	}
	
	@Override
	public String toString() {
		return "Sekvencijalni " + getClass().getSimpleName();
	}
}

