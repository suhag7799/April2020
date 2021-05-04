package test;



public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] tools = {"Selenium","Jira","QC","QTP"};
		System.out.println(tools.length);
	System.out.println(tools[0]);
	System.out.println(tools[1]);
	System.out.println(tools[2]);
	System.out.println(tools[3]);
	
	tools[3]="Test Direct";
	System.out.println(tools[3]);
	
	int[] myNumber = {10,20,30,40}; 	
	System.out.println(myNumber.length);
	
	System.out.println(myNumber[0]);
	System.out.println(myNumber[1]);
	System.out.println(myNumber[2]);
	System.out.println(myNumber[3]);

	}

}
