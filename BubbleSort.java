
public class BubbleSort <E> implements Comparable<E> {
	
	private E firstInt;
	private	E secondInt;
	
	public SubbleSort() {
		this.firstInt = 0;
		this.secondInt = 0;
	}

	public E compareTo(E other) {
		E  comparison = 0;
		if (firstInt==secondInt) comparison = 0;
		else if(firstInt < secondInt) comparison = -1;
		else if(firstInt > secondInt) comparison = 1;
		return comparison;
	}
	
	public E[] BubbleSort(E[] arrayToSort){
		E j;
		boolean flag = true;   // set flag to true to begin first pass
		E temp;   //holding variable
		Sort actualSort = new Sort();

		while ( flag ){
			flag= false;    //set flag to false awaiting a possible swap
			for( j=0;  j < arrayToSort.length-1;  j++ ){
				this.firstInt = arrayToSort[j];
				this.secondInt = arrayToSort[j+1];
				if ( compareTo(actualSort)==-1 ){   // change to > for ascending sort
					temp = arrayToSort[j];                //swap elements
					arrayToSort[j] = arrayToSort[j+1];
					arrayToSort[j+1] = temp;
					flag = true;              //shows a swap occurred  
				} 
			} 
		}
		return arrayToSort; 
	}
	
	
}
