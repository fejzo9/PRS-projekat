package parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import algorithams.MergeSort;

public class ParallelMergeSort{

    public static void sort(int[] niz, int lijevi, int desni) {
        SortTask task = new SortTask(niz, lijevi, desni);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
    }
	
	public static class SortTask extends RecursiveAction {

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
			
			if(lijevi < desni) {
				
				 int srednji = (lijevi + desni) / 2;
				 
				 SortTask prvaPolovina = new SortTask(niz, lijevi, srednji);
				 SortTask drugaPolovina = new SortTask(niz, srednji + 1, desni);
				 
				 invokeAll(prvaPolovina, drugaPolovina);
				 
				 MergeSort.merge(niz, lijevi, srednji, desni);
			}
		}
		
	}
}
