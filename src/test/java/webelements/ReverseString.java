package seleniumInterviewPractise;

public class ReverseString {
	

	public static void main(String[] args) {
		method(10, 20);
		
		String str ="adbchd";
		String rev="";
		int length = str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	public static void method(int a, int b) {
		int c= a+b;
		System.out.println(c);
		
	}

}
