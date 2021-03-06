package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;


// changed interface calculator to class calculator to work with
public class Calculator {
	
	
	//Calculator list 
	static List<Integer> testingList = new ArrayList<>();

	//get minimum method to call in main and get the minimum Integer of the List
	public int getMinimum() {
		
		int minimum = (int) testingList.get(0);
		for (int i =1;i<testingList.size();i++) {
			int tested = (int) testingList.get(i);	
			if (minimum>tested) {
				minimum = tested;
			}
		}
		
		return minimum;
	
	}
	//same as minimum but with the Maximum Integer
	 public int getMaximum() {
	    	
	    	int maximum = (int) testingList.get(0);
	    	for (int i =1;i<testingList.size();i++) {
	    		int tested = (int) testingList.get(i);	
	    		if (maximum<tested) {
	    			maximum = tested;
	    		}

	    }
	    	return maximum;
	   }
	 
	 //Method to calculate the sum of all Integers in the List by adding them up
	 public int sum() {
		int sum = 0;
		
		for(int i=0; i<testingList.size()-1; i++ ) {
			sum+=testingList.get(i);
		}
		return sum;
		 
	 }
	 
	 //Method to add an Integer to the List
	  public List<Integer> addValue(int zugabe) {

	        testingList.add(zugabe);
	        return testingList;
	    }


}
/**
 * Student 1
 * Student 2+
 * Student 3 (OPTIONAL)
 * 
 * TODO Instruction for GIT Lab for Grading GIT Part of Configuration Management
 *  - copy content of this git repository / zip file
 *
 *	- create your own remote repository, take care about Project Layout (!)
 * 
 *  (! Student 1 !)
 *  - create Main Class with 'public static void main(String[] args)'
 *	- create empty getMinimum() 
 *	- create empty getMaximum()
 *	- create addValue() which add an Integer to a list for later usage in getMinimum(), getMaximum() and other Methods
 *
 *  => publish current skeleton for your colleague(s) in remote repository
 *
 *
 *  (! Student 1 !)
 *  - implement getMinimum() which returns lowest Integer
 *	- test your method in main()
 * 
 *  => publish current implementation for your colleague(s) in remote repository
 *
 *
 *  (! Student 2 !)
 *  - implement getMaximum() which returns highest Integer
 *	- test your method in main()
 * 
 *  => publish current implementation for your colleague(s) in remote repository
 *  
 * 
 * (! all Students !)
 *  - implement a sum() which returns the sum of all Integer Values added by add()
 *	- implement this method with different implementations
 *	- commit your changes
 *	- if every Student has finished with commit, start to push your implementation
 *	- if every implementation has been pushed to remote, tag final implementation with "FinalVersion"
 *  
 *
 * FINAL ASSIGNMENT
 *  - don't forget to push everything (!) 
 *	  AND final version includes 
 *		- runnable source code
 *		- with test call methods in main Class
 *		- before commit take care that you previously tested your own source code 
 * - finish your assignment at elearning website with publishing repository url
 *
 * 
 * REMEMBER Git commands:
 *
 *   											<- Clone (FROM REMOTE)
 *   				<- Checkout (From LOCAL)
 *   -> (add) 		-> Commit (TO LOCAL) 		-> Push (TO REMOTE)
 *   					  		(LOCAL)			<- Pull (FROM REMOTE)
 *
 *
 */

