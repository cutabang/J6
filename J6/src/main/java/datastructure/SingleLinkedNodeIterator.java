package datastructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleLinkedNodeIterator<T> implements Iterator<T>{
	private SingleLinkedListNode<T> current;

	public SingleLinkedNodeIterator(SingleLinkedListNode<T> top) {
		this.current = top;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public T next() {
		if (!hasNext()) throw new NoSuchElementException();
		
		T result = current.getElement();
		current = current.getNext();
		return result;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
    
}
