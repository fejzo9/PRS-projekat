package main;

import algorithams.BubbleSort;
import algorithams.InsertionSort;
import algorithams.MergeSort;
import algorithams.QuickSort;
import algorithams.SelectionSort;

public class Main {
	public static void main(String[] args) {
	
		int[] niz={3,7,0,2,44,-23,8,1,14,2,-8,9,5,6,4,3,1};
		  ispis(niz);
//		  InsertionSort.insertionSort(niz);
//		  SelectionSort.selectionSort(niz);
//		  BubbleSort.bubbleSort(niz);
//		  MergeSort.mergeSort(niz, 0, niz.length-1);
		  QuickSort.sort(niz, 0, niz.length-1);	
		  ispis(niz);
		
	}
	
	
	public static void ispis(int[] niz) {
		int i;
		System.out.print("\nNiz: ");
		for(i=0;i<niz.length;i++)
			System.out.print(niz[i] + " ");
			 
	}
}
