package myArrayList;

import java.util.Arrays;

public class ArrayList <T> {
	
	private int size = 10;
	private int currentSize = 0 ;
	private Object[] array = new Object[size];
	
	ArrayList(){
		
	}
	
	ArrayList(int size){
		this.size = size;
		
	}
	
	public void add(T obj)  {
		checkSize();
		array[currentSize] = obj;
		currentSize++;
	}
	
	public void add(int index, T obj) {
		checkSize();

		if(index > currentSize) {
			System.out.println("misake");
			return;
		}
		
		shiftRight(index);
		array[index] = obj;
		currentSize++;
	}
	
	public T get(int index) {
		if(index < 0 || index >= size) return null;
			 
		T obj = (T) array[index];
		
		return obj;
	}
	
	public T remove(int index) {
		if(isCellEmpty(index)) return null ;
		
		T obj = (T) array[index];
		shiftLeft(index);
		currentSize--;
		
		return obj;
		
	}
	
	public T remove(Object obj) {
		for (int i = 0; i < currentSize; i++) {
			T el = (T) array[i];
			if(obj.equals(el)) {
				shiftLeft(i);
				return el;
			}
		}
		currentSize--;
		return null;
	}
	
	private void checkSize() {
		if(currentSize >= size) extendArrayList();
		
	}
	
	private void extendArrayList() {
		int newSize = getNewSize();
		Object[] newArray = Arrays.copyOf(array, newSize);	
		
		array = newArray;
	}
	
	private int getNewSize() {
		int newSize = (size * 3) / 2 + 1;
		size = newSize;
		
		return newSize;
	}
	
	public int size() {
		return currentSize;
	}
	
	private void shiftLeft(int index) {
		int indexLastEl = currentSize - 1;
		for(int i = index; i < currentSize - 1  ; i++) {
			int indexToReplaceEl = i + 1;
			int indexToRemoveEl = i;
			array[indexToRemoveEl ] = array[indexToReplaceEl];
			
		}
		
		array[indexLastEl] = null;
	}
	

	private void shiftRight(int index) {
		for(int i = currentSize; i > index  ; i--) {
			int indexToReplaceEl = i - 1;
			int indexToRemoveEl = i;
			array[indexToRemoveEl ] = array[indexToReplaceEl];
			
		}
		
	}
	
	private boolean isCellEmpty(int index) {
		if(index < 0 || index >= size) return true;
		if(array[index] != null) return false;
		
		return true;
	}

	public String toString() {
		String listAsString = "";
		for (int i = 0; i < currentSize; i++) {
			Object obj = array[i];
			
			if(i > 0 )	listAsString += ", ";
			listAsString +=  obj;
		}
		listAsString = "[" + listAsString + "]";
		
		return listAsString;
		
	}
	
	public boolean contains(Object obj) {
		for (int i = 0; i < currentSize; i++) {
			if(array[i].equals(obj)) return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(array[0] == null) return true;
		else return false;
	}
	
	public int indexOf(Object obj) {
		for (int i = 0; i < currentSize; i++) {
			if(array[i].equals(obj)) return i;
		}
		
		return -1;
	}
	
}
