package org.java.lessons.ciclabile;


public class ListMockUp {
	
	public int[] originalArray; 
	
	public int index = 0;

	
	public ListMockUp() {
		
		setOriginalArray();
		
	}
	
	public ListMockUp(int[] originalArray) {
		
		setOriginalArray(originalArray);
		
	}
	
	public int[] getOriginalArray() {
		return originalArray;
	}
	
	private void setOriginalArray() {
		
		int[] arr = {0};
		
		this.originalArray = arr;
	}
	
	private void setOriginalArray(int[] originalArray) {
		this.originalArray = originalArray;
	}
	
	public int getElementoSuccessivo()   {
		
		
		int elementoSuccessivo = getOriginalArray()[index++];
		return elementoSuccessivo;
		
	}
	
	
	//deve restituire true se ci sono ancora elementi da restituire, altrimenti false
	public boolean hasAncoraElementi() {
		
		if(index<originalArray.length) return true;
		else return false;
		
	
	}
	
	//EXTRA
	
	public void addElemento(int num) {
		
		int[] newArr = new int[getOriginalArray().length+1];
		
		int x=0;
		while(x < getOriginalArray().length) {
			
			newArr[x]=getOriginalArray()[x];
			 x++;
			 
		}
		
		newArr[x] = num;
		
		setOriginalArray(newArr);
		
	}
	
}

