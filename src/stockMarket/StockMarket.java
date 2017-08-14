package stockMarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class StockMarket {
	public static float[] prices;
	public static final int num = 10;

	public static void main(String[] args) {
		Random r = new Random();
		prices = new float[num];
		for (int i = 0; i < prices.length; i++)
			prices[i] = ((float) r.nextInt(1000)) / 100;

		ArrayList<Integer> valleys = new ArrayList<>();
		ArrayList<Integer> peaks = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			if (i != 0 && valleys.size() > 0 && prices[i - 1] < prices[i] && (i == num - 1 || prices[i + 1] < prices[i]))
				peaks.add(i);
			else
				if ((i == 0 || prices[i - 1] > prices[i]) && i < num - 1 && prices[i + 1] > prices[i])
					valleys.add(i);
		}
		
	}
}
