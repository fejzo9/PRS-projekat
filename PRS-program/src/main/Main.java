package main;

import java.util.concurrent.ForkJoinPool;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import algorithms.Sort;
import model.SortModel;
import parallel.ParallelBubbleSort;
import parallel.ParallelInsertionSort;
import parallel.ParallelMergeSort;
import parallel.ParallelQuickSort;
import parallel.ParallelSelectionSort;

public class Main {
	public static void main(String[] args) {
	
		long startTime;
		long endTime;
		
		SortModel sortModel = new SortModel();
		
		
//		System.out.println("SEKVENCIJALNI MERGE SORT");
//		ispis(niz);
//		startTime = System.currentTimeMillis();
//		MergeSort mergeSort = new MergeSort();
//		mergeSort.sort(niz, 0, niz.length-1);
//		endTime = System.currentTimeMillis();
//		ispis(niz); 
//		System.out.println("\nVrijeme izvrsenja mergesorta = " + (endTime - startTime) + "ms\n");
//		
//		System.out.println("PARALELNI MERGE SORT");
//		niz = new double[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
//		ispis(niz);
//		startTime = System.currentTimeMillis();
//		new ParallelMergeSort().sort(niz, 0, niz.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(niz);
//		System.out.println("\nVrijeme izvrsenja paralelnog merge sorta = " + (endTime - startTime) + "ms\n");
//		
//		System.out.println("SEKVENCIJALNI QUICK SORT");
//		niz = new double[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
//		ispis(niz);
//		startTime = System.currentTimeMillis();
//		QuickSort quickSort = new QuickSort();
//		quickSort.sort(niz, 0, niz.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(niz);
//		System.out.println("\nVrijeme izvrsenja quicksorta = " + (endTime - startTime) + "ms\n");
//		
//		System.out.println("PARALELNI QUICK SORT");
//		niz = new double[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
//		ispis(niz);
//		startTime = System.currentTimeMillis();
//		ParallelQuickSort parallelQuickSort = new ParallelQuickSort();
//		parallelQuickSort.sort(niz, 0, niz.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(niz);
//		System.out.println("\nVrijeme izvrsenja paralelnog quicksorta = " + (endTime - startTime) + "ms\n");
		
		System.out.println("SEKVENCIJALNI BUBBLE SORT SA INTEGERIMA");
		Integer[] nizInt = sortModel.getRandomInts(50);
		ispis(nizInt);
		startTime = System.currentTimeMillis();
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(nizInt, 0, nizInt.length - 1);
		endTime = System.currentTimeMillis();
		ispis(nizInt);
		System.out.println("\nVrijeme izvrsenja sekvencijalnog bubblesorta = " + (endTime - startTime) + "ms\n");
		
		System.out.println("SEKVENCIJALNI BUBBLE SORT SA DOUBLESIMA");
		Double[] nizDub = sortModel.getRandomDoubles(50);
		ispis(nizDub);
		startTime = System.currentTimeMillis();
		bubbleSort.sort(nizDub, 0, nizDub.length - 1);
		endTime = System.currentTimeMillis();
		ispis(nizDub);
		System.out.println("\nVrijeme izvrsenja sekvencijalnog bubblesorta = " + (endTime - startTime) + "ms\n");
		
//		System.out.println("PARALELNI BUBBLE SORT");
//		niz = new double[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
//		ispis(niz);
//		startTime = System.currentTimeMillis();
//		ParallelBubbleSort parallelBubbleSort = new ParallelBubbleSort();
//		parallelBubbleSort.sort(niz, 0, niz.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(niz);
//		System.out.println("\nVrijeme izvrsenja paralelnog bubblesorta = " + (endTime - startTime) + "ms\n");
//		
//		System.out.println("PARALELNI INSERTION SORT");
//		niz = new double[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
//		ispis(niz);
//		startTime = System.currentTimeMillis();
//		ParallelInsertionSort parallelInsertionSort = new ParallelInsertionSort();
//		parallelInsertionSort.sort(niz, 0, niz.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(niz);
//		System.out.println("\nVrijeme izvrsenja paralelnog insertion sorta = " + (endTime - startTime) + "ms\n");
//		
//		System.out.println("PARALELNI SELECTION SORT");
//		niz = new double[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
//		ispis(niz);
//		startTime = System.currentTimeMillis();
//		ParallelSelectionSort parallelSelectionSort = new ParallelSelectionSort();
//		parallelSelectionSort.sort(niz, 0, niz.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(niz);
//		System.out.println("\nVrijeme izvrsenja paralelnog selection sorta = " + (endTime - startTime) + "ms\n");
	}
	public static void ispis(Number[] niz) {
		int i;
		System.out.print("\nNiz: ");
		for(i=0;i<niz.length;i++)
			System.out.print(niz[i] + " ");
			 
	}
}
