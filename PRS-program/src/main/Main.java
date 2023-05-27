package main;

import java.util.concurrent.ForkJoinPool;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import parallel.ParallelBubbleSort;
import parallel.ParallelInsertionSort;
import parallel.ParallelMergeSort;
import parallel.ParallelQuickSort;
import parallel.ParallelSelectionSort;

public class Main {
	public static void main(String[] args) {
	
		long startTime;
		long endTime;
		
		int[] niz={3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		System.out.println("SEKVENCIJALNI MERGE SORT");
		ispis(niz);
		startTime = System.currentTimeMillis();
		MergeSort.sort(niz, 0, niz.length-1);
		endTime = System.currentTimeMillis();
		ispis(niz); 
		System.out.println("\nVrijeme izvrsenja mergesorta = " + (endTime - startTime) + "ms\n");
		
		System.out.println("PARALELNI MERGE SORT");
		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
		startTime = System.currentTimeMillis();
		ParallelMergeSort.sort(niz, 0, niz.length - 1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja paralelnog merge sorta = " + (endTime - startTime) + "ms\n");
		
		System.out.println("SEKVENCIJALNI QUICK SORT");
		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
		startTime = System.currentTimeMillis();
		QuickSort.sort(niz, 0, niz.length - 1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja quicksorta = " + (endTime - startTime) + "ms\n");
		
		System.out.println("PARALELNI QUICK SORT");
		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
		startTime = System.currentTimeMillis();
		ParallelQuickSort.sort(niz, 0, niz.length - 1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja paralelnog quicksorta = " + (endTime - startTime) + "ms\n");
		
		System.out.println("SEKVENCIJALNI BUBBLE SORT");
		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
		startTime = System.currentTimeMillis();
		BubbleSort.sort(niz, 0, niz.length - 1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja paralelnog quicksorta = " + (endTime - startTime) + "ms\n");
		
		System.out.println("PARALELNI BUBBLE SORT");
		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
		startTime = System.currentTimeMillis();
		ParallelBubbleSort.sort(niz, 0, niz.length - 1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja paralelnog bubblesorta = " + (endTime - startTime) + "ms\n");
		
		System.out.println("PARALELNI INSERTION SORT");
		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
		startTime = System.currentTimeMillis();
		ParallelInsertionSort.sort(niz, 0, niz.length - 1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja paralelnog insertion sorta = " + (endTime - startTime) + "ms\n");
		
		System.out.println("PARALELNI SELECTION SORT");
		niz = new int[] {3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		ispis(niz);
		startTime = System.currentTimeMillis();
		ParallelSelectionSort.sort(niz, 0, niz.length - 1);
		endTime = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja paralelnog selection sorta = " + (endTime - startTime) + "ms\n");
	}
	public static void ispis(int[] niz) {
		int i;
		System.out.print("\nNiz: ");
		for(i=0;i<niz.length;i++)
			System.out.print(niz[i] + " ");
			 
	}
}
