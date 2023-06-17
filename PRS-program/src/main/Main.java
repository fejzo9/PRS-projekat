package main;

import algorithms.BubbleSort;
import algorithms.QuickSort;
import algorithms.Sort;
import model.SortModel;
import parallel.ParallelQuickSort;

public class Main {
	public static void main(String[] args) {
		
		final int duzinaNiza = 10000;
		
		SortModel sortModel = new SortModel();

//		testiraj(new BubbleSort(), sortModel.randomCijeli(duzinaNiza));
//		testiraj(new BubbleSort(), sortModel.randomFloatovi(duzinaNiza));
//		testiraj(new QuickSort(), sortModel.randomCijeli(duzinaNiza));
//		testiraj(new QuickSort(), sortModel.randomDoublesi(duzinaNiza));
		testiraj(new ParallelQuickSort(), sortModel.randomCijeli(duzinaNiza));
//		testiraj(new ParallelQuickSort(), sortModel.randomFloatovi(duzinaNiza));
	}
	/**
	 * 
	 * Metod koji sortira dati niz datim sorterom i vraca vrijeme izvrsenja na system out.
	 * @param sorter - konkretna klasa za sortiranje
	 * @param niz - niz double ili integer vrijednosti
	 */
	public static <T extends Comparable<T>> void testiraj(Sort sorter, T[] niz) {
		System.out.println(sorter + " sa nizom " + niz.getClass().getSimpleName());
//		ispis(niz);
		double pocetnoVrijeme = System.currentTimeMillis();
		sorter.sort(niz, 0, niz.length - 1);
		double zavrsnoVrijeme = System.currentTimeMillis();
//		ispis(niz);
		System.out.println("\nVrijeme izvrsenja = " + (zavrsnoVrijeme - pocetnoVrijeme) + "ms\n");
	}
	
	public static <T extends Comparable<T>> void ispis(T[] niz) {
		int i;
		System.out.print("\nNiz: ");
		for(i=0;i<niz.length;i++)
			System.out.print(niz[i] + " ");
	}
}
