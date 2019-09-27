package org.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.userClasses.Animals;

class DequeueTest2 {

	@Test
	void test() {
		System.out.println("Demo Test running");
		assertEquals(true,true);
	}
	
	@Test
	void addItem() {
		Dequeue dtest = new Dequeue(5);
		dtest.rear=0; dtest.size =0; 
		dtest.list = new Object[5];
		Animals a1 =  new Animals("cat");
		dtest.addItem(a1);
		Object expected = a1;    // expected result
		assertEquals( expected, dtest.list[dtest.rear-1],  "object not added at the front");
	}
	@Test
	void popItem() {

		Animals a1 =  new Animals("lion");
		Object expected = a1;     // expected result
		Dequeue dtest = new Dequeue( 5);
		dtest.front =0;
		dtest.list = new Object[5];
	     dtest.addItem(a1);
		assertEquals( expected, dtest.popItem(), "matches"); // dtest.popItem() returns actual result
	}

}
