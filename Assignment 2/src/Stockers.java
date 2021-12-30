import java.util.Scanner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stockers {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter the number of companies\n");
		int n = sc.nextInt();
		double sp;
		String stc;
		List<Double> sharePrice = new ArrayList<Double>();
		List<String> stockPriceCompare = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the current stock price of " + i + " company ");
			sp = (sc.nextDouble());
			sharePrice.add(sp);
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			stc = sc.nextLine();
			stockPriceCompare.add(stc);
		}
		do {

			System.out.println("\n\t\t\t\t\t\tMENU\t\n");
			System.out.println("1 - Display the companies stock prices in ascending order");
			System.out.println("2 - Display the companies stock prices in descending order");
			System.out.println("3 - Display the total number of companies for which stock prices rose today");
			System.out.println("4 - Display the toatl number of companies for which stock prices declined today");
			System.out.println("5 - Search a specific stock price");
			System.out.println("6 - Exit");
			System.out.println("Enter your choice\n");
			choice = (sc.nextInt());
			switch (choice) {

			case 1:
				Collections.sort(sharePrice);
				System.out.println(sharePrice);
				break;
			case 2:
				Collections.sort(sharePrice, Collections.reverseOrder());
				System.out.println(sharePrice);
				break;
			case 3:
				int count = 0;
				for (String s : stockPriceCompare) {
					if (s.equalsIgnoreCase("true")) {
						count++;
					}
				}
				System.out.println(count);
				break;
			case 4:
				int c = 0;
				for (String s : stockPriceCompare) {
					if (s.equalsIgnoreCase("false")) {
						c++;
					}
				}
				System.out.println(c);
				break;
			case 5:
				System.out.println("Enter the stock price to be searched");
				double price = (sc.nextDouble());
				if (sharePrice.contains(price)) {
					System.out.println("Present");
				} else
					System.out.println("Not Present");
			}
		} while (choice < 6);
	}
}
