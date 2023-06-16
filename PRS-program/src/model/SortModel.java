package model;

import java.util.List;
import java.util.Random;


public class SortModel {

	public Integer[] getRandomInts(int size) {
		Random random = new Random();
	      Integer[] array = new Integer[size];
	      for (int i = 0; i < size; i++) {
	         array[i] = random.nextInt();
	      }
	      return array;
	}
	
	public Double[] getRandomDoubles(int size) {
		Random random = new Random();
	      Double[] array = new Double[size];
	      for (int i = 0; i < size; i++) {
	         array[i] = random.nextDouble(-1000000, 1000000);
	      }
	      return array;
	}
	
}
