package algorithms;

public class InsertionSort {

	public static void sort(int[] niz) {
		
		int i, j, priv;
		
		for(i=1;i<niz.length;i++){
			
			j=i;	
			
			while(j>0 && niz[j-1]>niz[j]){
				
				priv=niz[j-1];			               
				niz[j-1]=niz[j];			               
				niz[j]=priv;               
				j--;
			}
		}
			  
	}
}
