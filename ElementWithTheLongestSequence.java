package works;

import java.util.ArrayList;
import java.util.List;

public class ElementWithTheLongestSequence<T> {
	 int  longestSequence = 1;
	 List<T> elemetsWithTheLongestSequence = new ArrayList <>();
	
	 public  List<T>  getListOfTheElements(List<T> list) {
		setLongestSequence(list);
		setElWithTheLongestSequence(list);	

		System.out.println("longestSequence is " + longestSequence); 
		
		if(longestSequence == 1 ) return new ArrayList<T>();
		return elemetsWithTheLongestSequence;
		
	}
	
	public  void setLongestSequence(List<T> list) {
		int numOfSequences = 1;
		for (int i = 1; i < list.size(); i++) {
			T prevObj  = list.get(i - 1);
			T currObj =  list.get(i);
		
			if(currObj.equals(prevObj)) numOfSequences++; 
			else numOfSequences = 1;
			
			if(numOfSequences > longestSequence) longestSequence = numOfSequences;
		}
	}
	
	public  void setElWithTheLongestSequence(List<T> list) {
		int numOfSequences = 1;
		for (int i = 1; i < list.size(); i++) {
			T prevObj  = list.get(i - 1);
			T currObj =  list.get(i);
		
			if(currObj.equals(prevObj)) numOfSequences++;
			else numOfSequences = 1;
			
			if(numOfSequences == longestSequence) elemetsWithTheLongestSequence.add(currObj);
		}
	}
}
