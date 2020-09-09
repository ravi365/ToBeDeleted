package SeleniumConcepts;

public class LargestNumbers {

	public static void main(String[] args) {
		
		int n[] = {-10, 34, 7, 900, 6875};
		
		int largestNumber = n[0];
		int SmallestNumber = n[0];
		
		for (int i = 1; i<n.length; i++)
		{
		if (n[i] > largestNumber){
			largestNumber = n[i];
		} else if (n[i] < SmallestNumber)
		{
		SmallestNumber = n[i];
		}

	}
		 System.out.println(largestNumber);
		 System.out.println(SmallestNumber);
}}
