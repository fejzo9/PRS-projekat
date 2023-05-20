package parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import parallel.ParallelMergeSort.SortTask;

public class ParallelBubbleSort {

    public static void sort(int[] niz, int lijevi, int desni) {
        SortTask task = new SortTask(niz, lijevi, desni);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
    }
    
    public static class SortTask extends RecursiveAction {
    	
    	private static final int GRANICA = 100;
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
				//Sortiranje podniza bubble sortom
				 for (int i = lijevi; i < desni; i++) {
		                for (int j = lijevi; j < desni; j++) {
		                    if (niz[j] > niz[j + 1]) {
		                    	
		                        int temp = niz[j];
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
			}
			
		}
    }
}
