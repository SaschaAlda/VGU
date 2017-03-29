package org.vgu.se.customlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomList<E> implements List<E> {
	
	private List<E> liste = null;
	
	public CustomList( List<E> liste ){
		this.liste = liste;
	}

	public boolean add(E o) {
		// Cross cutting function BEFORE the addition is carried out:
		System.out.println( "LOG: now performing the addition of an object" );
		
		// Also, the time is captured:
		long timeStart = System.nanoTime(); 
		
		// Delegation to internal list
		liste.add(o);
		
		// Cross cutting function AFTER the addition is carried out:
		long timeEnd = System.nanoTime(); 
		long time = timeEnd - timeStart; 
		System.out.println( "LOG: Addition completed! Time: " + time );
	
		return true;
	}

	public void add(int index, E element) {
		this.liste.add(index, element);
	}

	public boolean addAll(Collection<? extends E> c) {
		return this.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		return false;
	}

	public void clear() {
		this.liste.clear();
		
	}

	public boolean contains(Object o) {
		return this.liste.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return this.liste.containsAll(c);
	}

	public E get(int index) {
		return this.get(index);
	}

	public int indexOf(Object o) {
		return 0;
	}

	public boolean isEmpty() {
		return this.liste.isEmpty();
		
	}

	/*
	 * Diese Methode MUSS fuer eine 'for each' Methode ueberschrieben werden
	 * (non-Javadoc)
	 * @see java.util.List#iterator()
	 */
	public Iterator<E> iterator() {
		return this.liste.iterator();
	}

	public int lastIndexOf(Object o) {
		return this.lastIndexOf(o);
	}

	public ListIterator<E> listIterator() {
		return this.listIterator();
	}

	public ListIterator<E> listIterator(int index) {
		return this.listIterator(index);
	}

	public boolean remove(Object o) {
		return this.liste.remove(o);
	}

	public E remove(int index) {
		return this.liste.remove(index);
	}

	public boolean removeAll(Collection<?> c) {
		return this.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return this.liste.retainAll(c);
	}

	public E set(int index, E element) {
		return this.set(index, element);
	}

	public int size() {
		return this.liste.size();
	}

	public List<E> subList(int fromIndex, int toIndex) {
		return this.liste.subList(fromIndex, toIndex);
	}

	public Object[] toArray() {
		return this.liste.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return this.liste.toArray(a);
	}

}
