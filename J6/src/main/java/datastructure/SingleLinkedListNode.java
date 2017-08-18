package datastructure;

public class SingleLinkedListNode<T> {
	private T element;
	private SingleLinkedListNode<T> next;
	
	

	public SingleLinkedListNode(T element, SingleLinkedListNode<T> next) {
		this.element = element;
		this.next = next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public SingleLinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(SingleLinkedListNode<T> next) {
		this.next = next;
	}
	
}
