package algorithms;

public class BubbleSort{
	public static void sort(int[] niz) {
		
		for(int i = 1; i < niz.length; i++){
			for(int j = 0; j < niz.length - 1; j++){
				
			     if(niz[j] > niz[j + 1]){
			    	 
			    	 int pom = niz[j];	                    
			    	 niz[j] = niz[j + 1];                    
			    	 niz[j + 1]=pom;
			        }
			   }
		}
			  
	}
}

