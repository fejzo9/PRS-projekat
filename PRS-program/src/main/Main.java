package main;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.Sort;
import model.SortModel;

public class Main {
	public static void main(String[] args) {
	
		long startTime;
		long endTime;
		
		SortModel sortModel = new SortModel();
		
		System.out.println("SEKVENCIJALNI BUBBLE SORT SA INTEGERIMA");
		Integer[] nizInt = sortModel.getRandomInts(50);
		testiraj(nizInt, new BubbleSort());
		
//		System.out.println("SEKVENCIJALNI BUBBLE SORT SA DOUBLESIMA");
//		Double[] nizDub = sortModel.getRandomDoubles(50);
//		ispis(nizDub);
//		startTime = System.currentTimeMillis();
//		bubbleSort.sort(nizDub, 0, nizDub.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(nizDub);
//		System.out.println("\nVrijeme izvrsenja = " + (endTime - startTime) + "ms\n");
		
//		System.out.println("SEKVENCIJALNI INSERTION SORT SA INTEGERIMA");
//		nizInt = sortModel.getRandomInts(50);
//		ispis(nizInt);
//		startTime = System.currentTimeMillis();
//		InsertionSort insertionSort = new InsertionSort();
//		insertionSort.sort(nizInt, 0, nizInt.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(nizInt);
//		System.out.println("\nVrijeme izvrsenja = " + (endTime - startTime) + "ms\n");
//		
//		System.out.println("SEKVENCIJALNI INSERTION SORT SA DOUBLESIMA");
//		nizDub = sortModel.getRandomDoubles(50);
//		ispis(nizDub);
//		startTime = System.currentTimeMillis();
//		insertionSort.sort(nizDub, 0, nizDub.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(nizDub);
//		System.out.println("\nVrijeme izvrsenja = " + (endTime - startTime) + "ms\n");
		

	}
	
	public static <T extends Comparable<T>> void testiraj(T[] niz, Sort sorter) {
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
