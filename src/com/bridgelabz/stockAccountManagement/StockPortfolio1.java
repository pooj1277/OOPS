/*Stock Management Program to read in Stock Names, Number of Share, Share Price.
Print a Stock Report with the total value of each Stock and the total value of
Stock.
 * 
 */

package com.bridgelabz.stockAccountManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio1 {	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Stock1> stocks = new ArrayList<>();
	
	public static void main(String[] args) {
		StockPortfolio1 stockPF = new StockPortfolio1();
		stockPF.stockCalculator();
	}
	
	public void stockCalculator() {
		double totalStockValue = 0;
		System.out.println("Enter number of stocks you want to buy : ");
		int company = scanner.nextInt();
		scanner.nextLine();		
		for (int i = 0; i < company; i++) {
			System.out.println("Enter the comapany name "+(i+1));
			System.out.println("Enter the Name of the Share : ");
			String shareName = scanner.nextLine();
			System.out.println("Enter how many share you want to buy for "+shareName+" company : ");
			int numberOfShare = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the price of "+shareName+ " share : ");
			double priceOfShare = scanner.nextDouble();
			scanner.nextLine();
			double priceOfStock = (double)numberOfShare * (double)priceOfShare;
			stocks.add(new Stock1(shareName, numberOfShare, priceOfShare));
			totalStockValue += priceOfStock;
		}
		System.out.println(stocks);
		System.out.println("Your total value of all the stocks is : "+totalStockValue+"Rs");
	}

}
