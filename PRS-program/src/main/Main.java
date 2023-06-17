package main;

import algorithms.BubbleSort;
import algorithms.Sort;
import model.SortModel;

public class Main {
	public static void main(String[] args) {
		
		SortModel sortModel = new SortModel();
		
		BubbleSort bubbleSort = new BubbleSort();
		Integer[] nizInt = sortModel.getRandomInts(50);
		testiraj(nizInt, bubbleSort);
		
		Double[] nizDouble = sortModel.getRandomDoubles(50);
		testiraj(nizDouble, bubbleSort);
		
	}
	
	public static <T extends Comparable<T>> void testiraj(T[] niz, Sort sorter) {
		System.out.println(sorter + " sa nizom " + niz.getClass().getSimpleName());
		ispis(niz);
		double startTime = System.currentTimeMillis();
		sorter.sort(niz, 0, niz.length - 1);
		double endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja = " + (endTime - startTime) + "ms\n");
	}
	
	public static <T extends Comparable<T>> void ispis(T[] niz) {
		int i;
		System.out.print("\nNiz: ");
		for(i=0;i<niz.length;i++)
			System.out.print(niz[i] + " ");
			 
	}
}
