package me.prae.algorithmsdatastructs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements List<T>
{
	public Node head;
	public Node tail;
	public int size;

	public class Node
	{
		public T data;
		public Node next;
		public Node prev;

		public Node(T data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public DoublyLinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}

	public int size()
	{
		return size;
	}

	public boolean isEmpty()
	{
		return(size == 0);
	}

	public boolean add(T e)
	{
		Node newNode = new Node(e);

		if (isEmpty())
		{
			head = newNode;
		} else
		{
			newNode.prev = tail;
			tail.next = newNode;
		}
		tail = newNode;
		size++;
		return true;
	}

	public void add(int index, T data) throws IndexOutOfBoundsException
	{
		Node newNode = new Node(data);

		if (isEmpty())
		{
			head = newNode;
			tail = newNode;
		}

		else if (index == 0)
		{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}

		else if (index == size())
		{
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}

		else
		{
			assert index > 0;
			Node nodeBefore = getNodeAt(index - 1);

			newNode.next = nodeBefore.next;
			newNode.next.prev = newNode;

			newNode.prev = nodeBefore;
			nodeBefore.next = newNode;
		}

		size++;
	}

	public T get(int index)
	{
		return getNodeAt(index).data;
	}

	public Node getNodeAt(int index)
	{
		assert index >= 0 && index < size;
		int mid = size / 2;
		Node node;

		if (index <= mid)
		{
			node = head;
			for (int i = 0; i < index; i++)
			{
				node = node.next;
			}
		} else
		{
			node = tail;
			for (int i = size - 1; i > index; i--)
			{
				node = node.prev;
			}
		}

		return node;
	}

	public T remove(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException();
		}

		T returnValue;

		if (size == 0)
		{
			returnValue = head.data;
			head = head.next;
			if (head == null) {
				tail = null; }
		} else
		{
			Node nodeBefore = getNodeAt(index - 1);
			Node nodeToRemove = nodeBefore.next;
			Node nodeAfter = nodeToRemove.next;
			nodeBefore.next = nodeAfter;
			if (nodeAfter != null)
				nodeAfter.prev = nodeBefore;

			else
				tail = nodeAfter;

			returnValue = nodeToRemove.data;

			if (index == size() - 1)
				tail = nodeBefore;
		}

		size--;
		return returnValue;
	}

	public boolean remove(Object o)
	{
		Node cur = head;
		Node prev = null;

		while (cur != null && !cur.data.equals(o))
		{
			prev = cur;
			cur = cur.next;
		}

		if (cur == null)
			return false;

		if (cur == head)
			head = cur.next;

		if (prev != null)
		{
			prev.next = cur.next;
			if (cur == tail)
				tail = prev;
		}

		size--;
		return true;
	}

	public boolean contains(Object arg0)
	{
		for (int i=0; i<size;i++){
			if (get(i).equals(arg0)){
				return true;
			}
		}
		return false;
	}

	public Iterator<T> iterator()
	{
		return null;
	}

	public Object[] toArray()
	{
		ArrayList<T> sArrayList = new ArrayList<T>();
		for(int i=0; i<size;i++)
		{
			sArrayList.add(get(i));
		}
		return sArrayList.toArray();
	}

	@Override
	public <K> K[] toArray(K[] arg0)
	{
		ArrayList<T> TKarrayList = new ArrayList<T>();
		for (int i=0; i<size;i++)
		{
			TKarrayList.add(get(i));
		}
		return TKarrayList.toArray(arg0);
	}

	public boolean containsAll(Collection<?> arg0)
	{
		boolean mod = false;
		for (int i = 0; i< size; i++) {
			if (arg0.equals(get(i))){
			mod = true;
			return mod;}
		}
		return mod;
	}

	public boolean addAll(Collection<? extends T> arg0)
	{
		boolean mod = false;
		for (T e : arg0) {
			if (add(e)) {
				mod = true; }}
		return mod;
	}

	public boolean addAll(int arg0, Collection<? extends T> arg1)
	{
		return false;
	}

	public boolean removeAll(Collection<?> arg0)
	{
		return false;
	}

	public boolean retainAll(Collection<?> arg0)
	{
		return false;
	}

	public void clear() {size = 0;}

	public T set(int arg0, T arg1)
	{
		return null;
	}

	public T getLast()
	{
		return get(size);
	}

	public int indexOf(Object o)
	{
		Node current = head;
		int index = 0;

		while (current != null)
		{
			if (current.data.equals(o))
			{
				return index;
			} else
			{
				current = current.next;
				index++;
			}
		}
		return size+1;
	}

	public int lastIndexOf(Object arg0)
	{
		return indexOf(arg0);
	}

	public List<T> subList(int arg0, int arg1)
	{
		return null;
	}

	public ListIterator<T> listIterator(int index)
	{
		return null;
	}

	public ListIterator<T> listIterator()
	{
		return new Iterate();
	}

	public class Iterate implements ListIterator<T>
	{
		public Node current = head.next;
		public Node accessedLast = null;

		public int index = 0;

		public boolean hasNext()
		{
			return index<size;
		}

		public boolean hasPrevious()
		{
			return index>0;
		}

		public int previousIndex()
		{
			return index-1;
		}

		public int nextIndex()
		{
			return index+1;
		}


		public T next() throws NoSuchElementException
		{
			accessedLast = current;
			return accessedLast.data;
		}

		public T previous() throws NoSuchElementException
		{
			current = current.prev;
			index--;
			accessedLast = current;
			return current.data;
		}

		public void set(T item) throws IllegalStateException
		{
			accessedLast.data = item;
		}

		public void remove() throws IllegalStateException
		{
			Node first = accessedLast.prev;
			Node second = accessedLast.next;
			first.next = second;
			second.prev = first;
			size--;
			if (current == accessedLast)
				current = second;
			else
				index--;
			accessedLast = null;
		}

		public void add(T item)
		{
			Node first = current.prev;
			Node second = new Node(item);
			Node third = current;
			second.data = item;
			first.next = second;
			second.next = third;
			third.prev = second;
			second.prev = first;
			size++;
			index++;
			accessedLast = null;
		}
	}

}