package test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String myName = "Suhag";
		System.out.println(myName);
		
		String lastName = "Patel";
		System.out.println(lastName);
		System.out.println(myName+lastName);
		System.out.println(myName.charAt(2));
		System.out.println(myName.indexOf('h'));
		System.out.println(myName.concat(lastName));
		int i=100, j=10;
		lastName.concat("repeat");
		System.out.println(myName+i+j);
		System.out.println(myName+(i+j));
		System.out.println(i+j+myName);
		System.out.println("------------------"+lastName);
		
		String s1 = 10+20+"Hello"+2+3+300;
		
		System.out.println(s1);
	}

}
