package seleniumInterviewPractise;

public class FabonacciSeries {

	public static void main(String[] args) {
		int a=0; 
		int b=1;
		System.out.println("print the fabonacci series  " +a+"  " +b);
		for(int i=1; i<=10; i++)
		{
			int c = a+b;
			System.out.println("print the value of :   " +c);
			a=b;
			b=c;
		}
		
		

	}

}
