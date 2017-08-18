package datastructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyStack<T> implements Iterable<T> {
    private SingleLinkedListNode<T> top;
    private int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void push(T element) {
		top = new SingleLinkedListNode<T>(element, top);
		size++;
	}
	
	public T pop () {
		if (isEmpty()) throw new NoSuchElementException();
		
		T result = top.getElement();
		top = top.getNext();
		size--;
		
		return result;
	}
	
	public T peek() {
		if (isEmpty()) throw new NoSuchElementException();
		
		return top.getElement();
	}
	
	@Override
	public Iterator<T> iterator() {
		return new SingleLinkedNodeIterator<T>(top);
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public int size() {
		return size;
	}

}
