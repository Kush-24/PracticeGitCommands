package wiprokushagra.topic1.ass4;

import java.util.Scanner;

public class AssertWithException {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to print pattern :");
		int row=sc.nextInt();
		
	try {
		if(row==0)
		 throw new  MyOwnZeroValueEnteredException("Rows can't be zero");
		else if(row<0)
		 throw new  MyOwnNegativeValueEnteredException("Rows cant be negative");
		else
			AssertExample.printPattern(row);
	}
	catch(Exception e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
		
	}

}
