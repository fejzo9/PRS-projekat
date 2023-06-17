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
		

//		testiraj(new BubbleSort(), sortModel.randomCijeli(duzinaNiza));
//		testiraj(new BubbleSort(), sortModel.randomDoublesi(duzinaNiza));
//		testiraj(new QuickSort(), sortModel.randomCijeli(duzinaNiza));
//		testiraj(new QuickSort(), sortModel.randomDoublesi(duzinaNiza));
//		testiraj(new ParallelQuickSort(), sortModel.randomCijeli(duzinaNiza));
//		testiraj(new ParallelQuickSort(), sortModel.randomDoublesi(duzinaNiza));
		
//		String[] niz = {"s", "h", "b", "w", "y", "u", "t", "z", "s", "d", "a", "b", "d", "y"};
// 		testiraj(new BubbleSort(), niz);
		
		System.out.println(sortModel.demonstrirajSortiranje(Algoritam.MERGE, true, 1000, false));
		
//		testiraj(new ParallelMergeSort<>(), sortModel.randomDoublesi(100));
//		testiraj(new ParallelQuickSort(), sortModel.randomDoublesi(1000));
	}
	/**
	 * 
	 * Metod koji sortira dati niz datim sorterom i vraca vrijeme izvrsenja na system out.
	 * @param sorter - konkretna klasa za sortiranje
	 * @param niz - niz double ili integer vrijednosti
	 */
	public static <T extends Comparable<T>> void testiraj(Sort sorter, T[] niz) {
		System.out.println(sorter + " sa nizom " + niz.getClass().getSimpleName());
		ispis(niz);
		double pocetnoVrijeme = System.currentTimeMillis();
		sorter.sort(niz, 0, niz.length - 1);
		double zavrsnoVrijeme = System.currentTimeMillis();
		ispis(niz);
		System.out.println("\nVrijeme izvrsenja = " + (zavrsnoVrijeme - pocetnoVrijeme) + "ms\n");
	}
	
	public static <T extends Comparable<T>> void ispis(T[] niz) {
		int i;
		System.out.print("\nNiz: ");
		for(i=0;i<niz.length;i++)
			System.out.print(niz[i] + " ");
	}
}
