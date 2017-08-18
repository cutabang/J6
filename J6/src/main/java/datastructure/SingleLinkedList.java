package datastructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleLinkedList<T> implements Iterable<T> {
	private SingleLinkedListNode<T> head;
	private int size;

	public static void main(String[] args) {
		SingleLinkedList<String> stringSLL = new SingleLinkedList<String>();
		
		stringSLL.addFront("a");
		stringSLL.addFront("b");
		stringSLL.addFront("c");
		
		System.out.println("size: " + stringSLL.getSize());
		for(String s : stringSLL) {
			System.out.print(s + " ");
		}

	}
	
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T> () {
			private SingleLinkedListNode<T> currentNode=head;

			@Override
			public boolean hasNext() {
				return currentNode != null;
			}

			@Override
			public T next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				
				T result=currentNode.getElement();
				currentNode = currentNode.getNext();
				
				return result;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}
	
	public boolean addFront(T element) {
		head = new SingleLinkedListNode<T>(element, head);
		size++;
		return true;
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
