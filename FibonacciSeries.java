package week1.day1;

public class FibonacciSeries{
	
	public static void main(String[] args) {
		int total=8;
		int firstnum=0;
		int secondnum=1;
		System.out.println(firstnum);
		System.out.println(secondnum);
		for(int i=1; i<=total; i++)
		{
			int thirdnum=firstnum+secondnum;
			System.out.println(thirdnum);
			firstnum=secondnum;
			secondnum=thirdnum;
			
			
			
		}
		

	}}

