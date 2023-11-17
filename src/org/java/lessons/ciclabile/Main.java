package org.java.lessons.ciclabile;

public class Main {

	public static void main(String[] args) {

		int[] numbers = {0,1,2,3,4,5};
		
		ListMockUp numList = new ListMockUp(numbers);
		
		numList.addElemento(7);
		
		System.out.println("numList \n----------");
		while(numList.hasAncoraElementi()) {
			
			int num =numList.getElementoSuccessivo();
			
			System.out.println(num + "\n----------");
		}
		
		ListMockUp noArgsNumList = new ListMockUp();
		
		System.out.println("noArgsNumList \n----------");
		
		while(noArgsNumList.hasAncoraElementi()) {
			
			int num = noArgsNumList.getElementoSuccessivo();
			
			System.out.println(num + "\n----------");
			
		}
	}

}
