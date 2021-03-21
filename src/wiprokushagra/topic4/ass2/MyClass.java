package wiprokushagra.topic4.ass2;

public class MyClass implements WordCount{
	
	public static void main(String[] args) {
		WordCount wc=new MyClass();
		int count=wc.count("Different way to use interface wordcount.");
		System.out.println(count+" total word ");
	}

	@Override
	public int count(String str) {
		return str.split(" ").length;
	}

}
