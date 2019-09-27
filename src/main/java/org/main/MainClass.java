package org.main;

import org.store.DequeueStore;
import org.userClasses.Animals;
import org.userClasses.Books;
import org.userClasses.Grocery;

public class MainClass {
public static void main(String[] args) {
		
		try {
			DequeueStore storeObj = new DequeueStore(5);//instance of store ,max size 5
		
		Animals a1 =  new Animals("lion");
		Books b1 = new Books("Alchemist");
		Grocery g1 = new Grocery("brocolli");
		Books b2 = new Books("Brida");
		Grocery g2 = new Grocery("Fruits");
//		Animals a2 =  new Animals("cheetah");
	     	storeObj.queueObj.addItem(a1);   // adding first item in dequeue array
	     	storeObj.queueObj.addItem(b1);
	     	storeObj.queueObj.addItem(g1);
	     	storeObj.queueObj.addItem(b2);
	     	storeObj.queueObj.addItem(g2);
//	     	storeObj.queueObj.addItem(a2);  // adding item out of array size
	    	System.out.println(storeObj.queueObj.popItem());   //removing 1st element
	    	System.out.println(storeObj.queueObj.popItem());  // removing 2nd element
			storeObj.queueObj.showItem();   // displaying items
		
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("array size exceeded");
}
}
}
