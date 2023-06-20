package main;

import java.util.concurrent.ForkJoinPool;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import appsInterface.AppsFrame;
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
		AppsFrame frame = new AppsFrame();
		
		System.out.println("SEKVENCIJALNI MERGE SORT");
		ispis(niz);
		startTime = System.currentTimeMillis();
		MergeSort.sort(niz, 0, niz.length-1);
		endTime = System.currentTimeMillis();
		ispis(niz); 
		System.out.println("\nVrijeme izvrsenja mergesorta = " + (endTime - startTime) + "ms\n");
		
	}
	public static void ispis(int[] niz) {
		int i;
		System.out.print("\nNiz: ");
		for(i=0;i<niz.length;i++)
			System.out.print(niz[i] + " ");	 
	}
	
	public static String prikaz (int[] niz)
	{
		String stringNiz = "";
		
		stringNiz+= "Niz: ";
		for(int i=0;i<niz.length;i++)
			stringNiz += niz[i] + " ";	
		
		return stringNiz;
	}
}
