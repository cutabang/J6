package datastructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyQueue<T> implements Iterable<T> {
	private SingleLinkedListNode<T> first;
	private SingleLinkedListNode<T> last;
	private int size;
	
	public void enqueue(T element) {
		SingleLinkedListNode<T> oldLast = last;
		last = new SingleLinkedListNode<T>(element, null);
		
		if (isEmpty()) {
			first = last;
		} else {
			oldLast.setNext(last);
		}
		
		size++;
	}
	
	public T dequeue() {
		if (isEmpty()) throw new NoSuchElementException();
		
		T result = first.getElement();
		first = first.getNext();
		size--;
		
		if (isEmpty()) {
			last = null;
		}
		
		return result;
	}
	
	public T front() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		
		return first.getElement();
	}
	
	public int size() {
	   return size;
	}
	  
	public boolean isEmpty() {
		return first==null;
	}
	

	@Override
	public Iterator<T> iterator() {
		return new SingleLinkedNodeIterator<T>(first);
	}

}
