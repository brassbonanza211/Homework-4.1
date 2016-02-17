import LinkedList.Node;

public class LinkedSet implements Set {
	private Node head;
	private int numberOfElements;

	public void LinkedList() {
		head = null;
		numberOfElements = 0;
	}

	private class Node {
		public final String data = null;
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
		} else {
			for (int i = 0; i < numberOfElements; i++) {
				// checking if the new item to be added is a duplicate

				if (current.data.equals(n.data)) {
					return;
				}

				// checking that current is pointing to the last node, so you
				// can add this new item
				if (current.next == null) {
					current.next = n;
				}
			}
		}
		numberOfElements++;
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
		return numberOfElements;
	}

	@Override
	public void remove(Object element) {
		Node n = new Node(element);
		int index = indexOf(element);
		Node current = head;
		Node previous = null;
		if (index > -1) {
			while (current.next != null) {
				previous = current;
				current = current.next;
				numberOfElements--;
				previous.next = current.next;
			}
		}

		return;

	}

	@Override
	public Set union(Set anotherSet) {
		Node current = head;
		while (current != null) {
			System.out.print(" " + current.data + " ");
			current = current.next;

		}
		
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

	@Override
	public int getLength() {
		return numberOfElements;
	}

	// Returns the index of the first occurrence of the given value in the list,
	// or -1 if the value is not found in the list.
	public int indexOf(Object element) {
		int index = 0;
		Node current = head;
		while (current != null) {
			if (current.data == element) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}

	public static void main(String[] args) {
		Set set = new LinkedSet();

		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Dates");
		set.add("Eggplant");

		System.out.println(set.getSize());
	}
}
