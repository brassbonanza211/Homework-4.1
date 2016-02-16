
public class LinkedSet implements Set {
	private Node head;
	private int numberOfElements;

	public void LinkedList() {
		head = null;
		numberOfElements = 0;
	}

	private class Node {
		private Node next;

		private Node(Object data) {
			this(data, null);
		}

		private Node(Object data, Node next) {
			this.next = next;
		}
	}

	@Override
	public void add(Object element) {
		Node n = new Node(element);
		Node current = head;
		if (numberOfElements == 0) {
			head = n;
		}
		if (current != n && current.next == null) {
			for (int i = 0; i < numberOfElements; i++) {
				current = current.next;
			}
			n = current.next;
		}
	}

	@Override
	public void addAll(Object[] elements) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object element) {
		Node current = head;
		if (current == element) {
			return true;
		}
		while (current != element) {
			current.next = current;
			if (current.next == null) {
				return false;
			}
			return true;
		}
		return true;
	}

	@Override
	public int getSize() {
		return numberOfElements;
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove(Object element) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set union(Set anotherSet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set intersection(Set anotherSet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set difference(Set anotherSet) {
		// TODO Auto-generated method stub
		return null;
	}

}
