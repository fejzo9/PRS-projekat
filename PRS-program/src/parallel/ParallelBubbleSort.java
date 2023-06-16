package parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import algorithms.MergeSort;

public class ParallelBubbleSort{

    public void sort(double[] niz, int lijevi, int desni) {
        SortTask task = new SortTask(niz, lijevi, desni);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
    }
    
    public static class SortTask extends RecursiveAction {
    	
    	//Efikasnost granice mozemo eksperimentalno dokazati
    	//a ako stavimo da je = 100 onda ce samo sekvencijalno sortirati nas mali niz
    	//zato sada stoji 4
    	private static final int GRANICA = 4;
		private double[] niz;
		private int lijevi;
		private int desni;

		public SortTask(double[] niz, int lijevi, int desni) {
			super();
			this.niz = niz;
			this.lijevi = lijevi;
			this.desni = desni;
		}

		@Override
		protected void compute() {
			if(desni - lijevi <= GRANICA) {
				//Sortiranje podniza bubble sortom
				 for (int i = lijevi + 1; i < desni + 1; i++) {
		                for (int j = lijevi; j < desni; j++) {
		                	
		                    if (niz[j] > niz[j + 1]) {
		                    	
		                        double temp = niz[j];
		                        niz[j] = niz[j + 1];
		                        niz[j + 1] = temp;
		                    }
		                }
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
