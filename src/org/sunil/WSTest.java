package org.sunil;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class WSTest {
	public static void main(String []args){
		CurrencyConvertor currencyConvertor = new CurrencyConvertor();
		CurrencyConvertorSoap port = currencyConvertor.getCurrencyConvertorSoap();
	
		double conversionRate = port.conversionRate(Currency.USD, Currency.INR);
		
		System.out.println("Conversion rate is "+ conversionRate);
	}
}
