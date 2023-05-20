package algorithms;

public class SelectionSort {

	public static void sort(int[] niz) {
	
		int i, min,j,pom;
	
		for(i=0;i<niz.length-1;i++){
            
			min=i;
			            
			for(j=i+1;j<niz.length;j++){			                
				if(niz[j]<niz[min]){
			            min=j;
			            }
			       }
			
				pom=niz[min];
				niz[min] = niz[i];
				niz[i]=pom;
		}
	}
}

