/*
 * 5 #
 * 4 # #
 * 3 # # #
 * 2 # # # #
 * 1 # # # # #
 */
public class Pattern1 {
	static void print(int n)
	{
		int count=n;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					System.out.print(count+"	");
					count--;
				}
				System.out.print("#	");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		print(5);
	}
}
