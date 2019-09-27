package org.store;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.userClasses.Animals;

class DequeueStoreTest {


	@Test
	void testStore() {  //to test that addItem is running right by calling it through object of Dequeue from DequeueStore class
		DequeueStore storeObj = new DequeueStore(5);
		Animals a1 =  new Animals("lion");
		storeObj.queueObj.addItem(a1);   // adding first item in dequeue array
        Object expected = a1;
     	Object actual = storeObj.queueObj.list[0];
		assertEquals( expected, actual , "added item through dequeueStore not matches"     );
	}

}
