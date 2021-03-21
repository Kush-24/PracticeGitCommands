package wiprokushagra.topic1.ass4;

public class AssertExample {
public static void main(String[] args) {
	int row=5;
	
	if(row>0)
		printPattern(row);
	else if(row==0)
		assert false : "Row can't be zero";
	else
		assert false : "Rows must be positive.";
	
}
/*
 *                *
 *             *     *
 *         *      *      *
 *             *      *
 *                *
 */
public static void printPattern(int row) {
	
	for(int i=1;i<=row;i++) {
	
		for(int space=1;space<=row-i;space++) {
			System.out.print("  ");
		}
		
		for(int star=1;star<=i;star++) {
			System.out.print(" *  ");
		}
	System.out.println();
	}
	
	for(int i=1;i<row;i++) {
		
		for(int space=1;space<=i;space++) {
			System.out.print("  ");
		}
		
		for(int star=row;star>i;star--) {
			System.out.print(" *  ");
		}
	System.out.println();
	}
	
}
}
