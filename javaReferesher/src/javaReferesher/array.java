package javaReferesher;
import java.util.ArrayList;
public class array {
	public static void main(String[] args){
		ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();
		arrayOfNumbers.add(1);
		arrayOfNumbers.add(2);
		arrayOfNumbers.add(3);
		arrayOfNumbers.add(2);
		arrayOfNumbers.add(3);
		arrayOfNumbers.add(1);
		arrayOfNumbers.add(3);
int result = getOddOccurence(arrayOfNumbers, arrayOfNumbers.size());
System.out.println("odd number out is " +result);

	}
	public static int  getOddOccurence(ArrayList<Integer> arrayOfNumbers , int size){
		int i;
		int res = 0;
		for(i = 0 ; i < size ; i++){
			res = res ^ arrayOfNumbers.get(i);
		}
		return res;
	}
	
	
	
}
