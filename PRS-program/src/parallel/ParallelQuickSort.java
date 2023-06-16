package parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import algorithms.QuickSort;
import parallel.ParallelMergeSort.SortTask;

public class ParallelQuickSort{

	public void sort(double[] niz, int lijevi, int desni) {
		SortTask task = new SortTask(niz, lijevi, desni);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
	}
	
	public static class SortTask extends RecursiveAction {
		
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
			
			if(lijevi < desni) {
				
				int pivot = QuickSort.partition(niz, lijevi, desni);
				
				SortTask lijevaStrana = new SortTask(niz, lijevi, pivot - 1);
				SortTask desnaStrana = new SortTask(niz, pivot + 1, desni);
				
				invokeAll(lijevaStrana, desnaStrana);
			}
		}
	}
	
}
