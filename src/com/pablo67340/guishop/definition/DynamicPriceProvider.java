package com.pablo67340.guishop.definition;

public interface DynamicPriceProvider {
	
	double calculateBuyPrice(String item, int quantity, double staticBuyPrice, double staticSellPrice);
	
	double calculateSellPrice(String item, int quantity, double staticBuyPrice, double staticSellPrice);
	
	void buyItem(int quantity);
	
	void sellItem(int quantity);
	
}
