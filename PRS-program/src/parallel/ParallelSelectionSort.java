package parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import algorithms.MergeSort;

public class ParallelSelectionSort {

    public static void sort(int[] niz, int lijevi, int desni) {
        SortTask task = new SortTask(niz, lijevi, desni);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
    }
    
    public static class SortTask extends RecursiveAction {
    	
    	//Efikasnost granice mozemo eksperimentalno dokazati
    	//a ako stavimo da je = 100 onda ce samo sekvencijalno sortirati nas mali niz
    	//zato sada stoji 4
    	private static final int GRANICA = 1;
		private int[] niz;
		private int lijevi;
		private int desni;

		public SortTask(int[] niz, int lijevi, int desni) {
			super();
			this.niz = niz;
			this.lijevi = lijevi;
			this.desni = desni;
		}

		@Override
		protected void compute() {
			if(desni - lijevi <= GRANICA) {
				int i, j, pom, min;
				//Sortiranje podniza selection sortom
				 for (i = lijevi; i < desni; i++) {
					 min = i;
		               for(j = i + 1; j < desni + 1; j++) {
		            	   if(niz[j] < niz[min])
		            		   min = j;
		               }
		               
						pom = niz[min];
						niz[min] = niz[i];
						niz[i] = pom;
					}
			} 
			else {
				//Podjela zadatka na podzadatke
				int srednji = lijevi + (desni - lijevi) / 2;
				
				SortTask prvaPolovina = new SortTask(niz, lijevi, srednji);
				SortTask drugaPolovina = new SortTask(niz, srednji + 1, desni);
				
				invokeAll(prvaPolovina, drugaPolovina);
				//Spajanje sortiranih nizova
				MergeSort.merge(niz, lijevi, srednji, desni);
			}
			
		}
    }
}
