package algorithams;

public class BubbleSort{
	public static void sort(int[] niz) {
		
		int i, j, pom;
		for(i=1;i<niz.length;i++){
			for(j=0;j<niz.length-1;j++){
				
			     if(niz[j]>niz[j+1]){
			    	 
			    	 pom=niz[j];	                    
			    	 niz[j] = niz[j+1];                    
			    	 niz[j+1]=pom;
			        }
			   }
		}
			  
	}
}

