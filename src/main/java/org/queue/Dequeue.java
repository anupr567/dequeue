package org.queue;



public class Dequeue {
	public Object[] list;
	int size, rear, front, arraySize;
	public Dequeue(int num) {            // user-defined constructor
		list = new Object[num];
		
	}
	
	public void addItem(Object obj) {
		list[rear] = obj;
		rear += 1;
		size +=1 ;
	}
	
    public Object popItem() {
	front += 1;
	Object poppedItem = list[front-1];
	System.out.println( "Popped item: ");
	return poppedItem;
	
}

    public void showItem() {
    	System.out.print("Elements: ");
	for(int i=front;i<size;i++) {
		System.out.print(list[i] + " ");
	}
	
}


}
