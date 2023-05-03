package main;

import algorithams.BubbleSort;
import algorithams.InsertionSort;
import algorithams.MergeSort;
import algorithams.QuickSort;
import algorithams.SelectionSort;

public class Main {
	public static void main(String[] args) {
	
		long startTime;
		long endTime;
		
		int[] niz={3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		  ispis(niz);
//		  InsertionSort.insertionSort(niz);
//		  SelectionSort.selectionSort(niz);
//		  BubbleSort.bubbleSort(niz);
		  startTime = System.currentTimeMillis();
		  MergeSort.mergeSort(niz, 0, niz.length-1);
		  endTime = System.currentTimeMillis();
//		  QuickSort.sort(niz, 0, niz.length-1);	
		  ispis(niz);
		  System.out.println("\nVrijeme izvrsenja = " + (endTime - startTime) + "ms");
	}
	
	
	public static void ispis(int[] niz) {
		int i;
		System.out.print("\nNiz: ");
		for(i=0;i<niz.length;i++)
			System.out.print(niz[i] + " ");
			 
	}
}
