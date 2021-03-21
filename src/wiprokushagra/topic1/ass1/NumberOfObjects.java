package wiprokushagra.topic1.ass1;

public class NumberOfObjects {
static int noOfObjets=0;

// instance block
{
	noOfObjets++;
}

public NumberOfObjects() {}
public NumberOfObjects(int a) {}
public NumberOfObjects(String a) {}
public NumberOfObjects(Long a) {}
public NumberOfObjects(Object o) {}


public static void main(String[] args) {
	NumberOfObjects no=new NumberOfObjects();
	NumberOfObjects no2=new NumberOfObjects(6);
	NumberOfObjects no3=new NumberOfObjects(new String(" "));
	
	System.out.println("Total "+NumberOfObjects.noOfObjets+" number of objects created.");
}

}
