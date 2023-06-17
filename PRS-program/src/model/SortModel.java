package model;

import java.util.Random;
import java.util.function.Function;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import algorithms.Sort;
import parallel.ParallelBubbleSort;
import parallel.ParallelInsertionSort;
import parallel.ParallelMergeSort;
import parallel.ParallelQuickSort;
import parallel.ParallelSelectionSort;


public class SortModel {

	/**
	 * @param duzina
	 * @return niz nasumicnih cijelih brojeva zadate duzine
	 */
	public Integer[] randomCijeli(int duzina) {
		Random random = new Random();
	      Integer[] niz = new Integer[duzina];
	      for (int i = 0; i < duzina; i++) {
	         niz[i] = random.nextInt();
	      }
	      return niz;
	}
	
	/**
	 * @param duzina
	 * @return niz nasumicnih double brojeva zadate duzine
	 */
	public Double[] randomDoublesi(int duzina) {
		Random random = new Random();
	      Double[] niz = new Double[duzina];
	      for (int i = 0; i < duzina; i++) {
	         niz[i] = random.nextDouble(-1000000, 1000000);
	      }
	      return niz;
	}
	
	public String demonstrirajSortiranje(Algoritam algoritam, boolean paralelni, int duzina,
			boolean cijeli) {
		
		String poruka = "Greska";
		
		Sort sorter = odaberiSort(algoritam, paralelni);
		
		if(cijeli) {
			poruka = testiraj(sorter, randomCijeli(duzina));
		} else {
			poruka = testiraj(sorter, randomDoublesi(duzina));
		}
		return poruka;
	}
	
	private Sort odaberiSort(Algoritam algoritam, boolean paralelni) {
		Sort sorter = null;
		switch (algoritam) {
		case BUBBLE:
			sorter = (paralelni) ? new ParallelBubbleSort() : new BubbleSort();
			break;
		case INSERTION:
			sorter = (paralelni) ? new ParallelInsertionSort() : new InsertionSort();
			break;
		case MERGE:
			sorter = (paralelni) ? new ParallelMergeSort() : new MergeSort();
			break;
		case QUICK:
			sorter = (paralelni) ? new ParallelQuickSort() : new QuickSort();
			break;
		case SELECTION:
			sorter = (paralelni) ? new ParallelSelectionSort() : new SelectionSort();
			break;
		}
		return sorter;
	}
	
	private <T extends Comparable<T>> String testiraj(Sort sorter, T[] niz) {
		
		double vrijemePocetka;
		double vrijemeZavrsetka;
		
		vrijemePocetka = System.currentTimeMillis();
		sorter.sort(niz, 0, niz.length - 1);
		vrijemeZavrsetka = System.currentTimeMillis();
		
		return sorter + " sa nizom " + niz.getClass().getSimpleName() +
				"\nVrijeme izvrsenja = " + (vrijemeZavrsetka - vrijemePocetka) + "ms\n";
	}
	
}
