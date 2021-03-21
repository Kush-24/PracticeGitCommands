package wiprokushagra.topic4.ass2;

public class MyClassWithLambda{

	public static void main(String[] args) {
		WordCount wc=str->str.split(" ").length; 
		int tw=wc.count("This is the sentence,Interface meth will return the total word.");
		System.out.println(tw);
	}
}
