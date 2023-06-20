package main;

import algorithms.BubbleSort;
import algorithms.QuickSort;
import algorithms.Sort;
import model.Algoritam;
import model.SortModel;
import parallel.ParallelMergeSort;
import parallel.ParallelQuickSort;

public class Main {
	public static void main(String[] args) {
		
		SortModel sortModel = new SortModel();
		
		System.out.println(sortModel.demonstrirajSortiranje(Algoritam.MERGE, true, 10, false));
		System.out.println(sortModel.demonstrirajSortiranje(Algoritam.BUBBLE, true, 10, true));
		System.out.println(sortModel.demonstrirajSortiranje(Algoritam.QUICK, true, 10, false));
	}
}
