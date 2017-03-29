package org.vgu.se.invoice;

public class Invoice {
	
	private int sum;
	private String currency;
	
	public Invoice( int sum, String currency ){
		this.sum = sum;
		this.currency = currency;
	}
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public boolean equals(Object object) {
		if (object == null) return false;
		
		if (! ( object instanceof Invoice) ) return false;
		
		Invoice betrag = (Invoice) object;
		
		if ( ( this.getSum() == betrag.getSum() ) && ( this.getCurrency().equals ( betrag.getCurrency() ) ) ) {
			return true;
		} else {
			return false;
		}
			
	}

}
