package wiprokushagra.topic1.ass2;

public class FinalizeDecRunner {
public static void main(String[] args) {
	FinalizeDeclare fd=new FinalizeDeclare();
	fd=new FinalizeDeclare();
	fd=new FinalizeDeclare();
	fd=new FinalizeDeclare();
	try {
		System.gc(); // finalize method called before gc.
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("inside catch..");
	}
	
	System.out.println("Program ends..");
}
}
