package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		if(input==0 || input==1)
		{
			System.out.println("Not a prime number");
			
		}
		boolean flag=true;
		for(int i=2; i<=input/2; i++)
		{
			if(input%i==0)
			{
				System.out.println("Not a Prime Number");
				flag =false;
				break;
				
			}
		}
if(flag)
{
	System.out.println("prime number");
}
	}

}
