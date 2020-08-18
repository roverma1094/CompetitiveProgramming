package geekforgeek;
//https://www.geeksforgeeks.org/return-a-pair-with-maximum-product-in-array-of-integers/

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MaxProductPair {
	
	private TreeMap<Integer,List<Integer>> resultMap;
	
	/**
	 * Constructor
	 */
	public MaxProductPair() {
		int[] input={1,2,3,-6,6,7,-8};
		System.out.println("Given array size :: "+input.length);
		findMaxProductPair(input);
	}
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		new MaxProductPair();
	}
	
	/**
	 * 
	 * @param input
	 */
	private void findMaxProductPair(int[] input) {
		resultMap=new TreeMap<>();
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				System.out.println("Multiplying :: "+input[i]+" and "+input[j]);
				int result=input[i]*input[j];
				System.out.println("Result Obtained :: "+result);
				List<Integer> numbers=new ArrayList<>();
				numbers.add(input[i]);
				numbers.add(input[j]);
				resultMap.put(result, numbers);
			}
		}
		
		System.out.println(resultMap);
		System.out.println("Highest Product Value is :: "+resultMap.lastKey());
		System.out.println("Pair of Product Value is :: "+resultMap.get(resultMap.lastKey()).get(0)+" and "+resultMap.get(resultMap.lastKey()).get(1));
	}

}
