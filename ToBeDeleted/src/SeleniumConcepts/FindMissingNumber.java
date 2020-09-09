package SeleniumConcepts;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int n[] = {1,2,3,4,6,7};
		
		int sum1 =0;
		for(int i=0; i<n.length; i++)
		{
			sum1 = sum1 + n[i];
			
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		for(int j =0; j<=7; j++)
		{
			sum2 = sum2 + j;
			
		}
		System.out.println(sum2);

	}

}
