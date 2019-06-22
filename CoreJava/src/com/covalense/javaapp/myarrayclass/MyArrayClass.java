package com.covalense.javaapp.myarrayclass;

public class MyArrayClass {

	private Object[] myArray;
	private int index;

	public MyArrayClass() {

		this(10);

	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size must be greater than zero");
		}
		myArray = new Object[size];

		index = 0;
	}

	/*public void add(Object val) {

		myArray[index] = val;
		index++;
	}*/
	
	public void add(Object val) {
		if(index>myArray.length-1) {
			Object[]myArraynew=new Object[20];
			System.arraycopy(myArray, 0, myArraynew, 0, myArray.length);
			myArray=myArraynew;
		}
		myArray[index]=val;
		index++;
	}
	
	
	public int size() {
		
		return index-1;
	}

	public Object get(int pos) {
		return myArray[pos];

	}

	/*
	 * public void remove(int pos) {
	 * 
	 * myArray[pos]=null; for(int i=pos;i<index;i++) { myArray[i]=myArray[i+1]; } }
	 */
	/*public void remove(int pos) {
		System.arraycopy(myArray, pos + 1, myArray, pos, myArray.length-1-pos);
	}*/
	public void remove(int pos) {
		
		if(pos>=myArray.length-1) {
			throw new ArrayIndexOutOfBoundsException("array index  is more");
		}
	
}
}
