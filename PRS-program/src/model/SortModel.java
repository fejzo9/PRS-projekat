package model;

import java.util.List;
import java.util.Random;


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

}
