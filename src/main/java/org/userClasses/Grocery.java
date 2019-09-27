package org.userClasses;

public class Grocery {

	public String item = new String();
//	public int quantity;
	public Grocery(String string) {
//		quantity = quant;
		item = string;
		
	}
	public String toString( ) {
		return this.item;
	}
//	public int toInt( ) {
//		return this.quantity;
//	}
}
