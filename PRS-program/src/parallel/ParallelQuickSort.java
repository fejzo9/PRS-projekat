package parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import algorithms.QuickSort;
import algorithms.Sort;

public class ParallelQuickSort <T extends Comparable<T>> implements Sort<T>{

	@Override
	public void sort(T[] niz, int lijevi, int desni) {
		SortTask<T> task = new SortTask<T>(niz, lijevi, desni);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
	}
	
	public static class SortTask <T extends Comparable<T>> extends RecursiveAction {
		
		private T[] niz;
		private int lijevi;
		private int desni;
		
		public SortTask(T[] niz, int lijevi, int desni) {
			super();
			this.niz = niz;
			this.lijevi = lijevi;
			this.desni = desni;
		}
		
		@Override
		protected void compute() {
			
			if(lijevi < desni) {
				
				int pivot = QuickSort.partition(niz, lijevi, desni);
				
				SortTask<?> lijevaStrana = new SortTask<T>(niz, lijevi, pivot - 1);
				SortTask<?> desnaStrana = new SortTask<T>(niz, pivot + 1, desni);
				
				invokeAll(lijevaStrana, desnaStrana);
			}
		}
	}
	
    @Override
    public String toString() {
    	return getClass().getSimpleName();
    }
	
}
