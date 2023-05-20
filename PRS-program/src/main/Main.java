package main;

import java.util.concurrent.ForkJoinPool;

import algorithams.BubbleSort;
import algorithams.InsertionSort;
import algorithams.MergeSort;
import algorithams.QuickSort;
import algorithams.SelectionSort;
import parallel.ParallelMergeSort;
import parallel.ParallelQuickSort;

public class Main {
	public static void main(String[] args) {
	
		long startTime;
		long endTime;
		
		int[] niz={3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
//		  InsertionSort.insertionSort(niz);
//		  SelectionSort.selectionSort(niz);
//		  BubbleSort.bubbleSort(niz);
//		  QuickSort.sort(niz, 0, niz.length-1);	
		startTime = System.currentTimeMillis();
		MergeSort.sort(niz, 0, niz.length-1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja mergesorta = " + (endTime - startTime) + "ms");
		  
		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
		startTime = System.currentTimeMillis();
		ParallelMergeSort.sort(niz, 0, niz.length - 1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja paralelnog merge sorta = " + (endTime - startTime) + "ms");
		  
		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
		startTime = System.currentTimeMillis();
		QuickSort.sort(niz, 0, niz.length - 1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja quicksorta = " + (endTime - startTime) + "ms");
		  
		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
		startTime = System.currentTimeMillis();
		ParallelQuickSort.sort(niz, 0, niz.length - 1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja paralelnog quicksorta = " + (endTime - startTime) + "ms");
		
//		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
//		ispis(niz);
//		startTime = System.currentTimeMillis();
//		ParallelBubbleSort.sort(niz, 0, niz.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(niz);
//		System.out.println("\nVrijeme izvrsenja paralelnog quicksorta = " + (endTime - startTime) + "ms");
//		
//		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
//		ispis(niz);
//		startTime = System.currentTimeMillis();
//		ParallelInsertionSort.sort(niz, 0, niz.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(niz);
//		System.out.println("\nVrijeme izvrsenja paralelnog quicksorta = " + (endTime - startTime) + "ms");
//		
//		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
//		ispis(niz);
//		startTime = System.currentTimeMillis();
//		ParallelSelectionSort.sort(niz, 0, niz.length - 1);
//		endTime = System.currentTimeMillis();
//		ispis(niz);
//		System.out.println("\nVrijeme izvrsenja paralelnog quicksorta = " + (endTime - startTime) + "ms");
	}
	public static void ispis(int[] niz) {
		int i;
		System.out.print("\nNiz: ");
		for(i=0;i<niz.length;i++)
			System.out.print(niz[i] + " ");
			 
	}
}
