package com.bridgelabz.stockAccountManagement;

public class Stock1 {

	private String shareName;
	private int numberOfShares;
	private double sharePrice;
	double totalStockPrice;

	public Stock1(String shareName, int numberOfShares, double sharePrice) {
		this.shareName = shareName;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
		totalStockPrice = (double)numberOfShares * (double)sharePrice;
	}

	@Override
	public String toString() {
		return "Stock [stockName=" + shareName + ", numberOfShares=" + numberOfShares + ", sharePrice=" + sharePrice
				+ ", totalStockPrice=" + totalStockPrice + "]";
	}

}