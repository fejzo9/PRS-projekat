package algorithms;

public class BubbleSort{
	public static void sort(int[] niz, int lijevi, int desni) {
		
		 for (int i = lijevi + 1; i < desni + 1; i++) {
             for (int j = lijevi; j < desni; j++) {
             	
                 if (niz[j] > niz[j + 1]) {
                 	
                     int temp = niz[j];
                     niz[j] = niz[j + 1];
                     niz[j + 1] = temp;
                 }
             }
			}
			  
	}
}

