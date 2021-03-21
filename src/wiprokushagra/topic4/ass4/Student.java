package wiprokushagra.topic4.ass4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Student {
	
	
	public static double calculateAvg(List<Integer> marks) throws Exception{
		if(marks==null || marks.size()==0) return 0;
		// marks.stream().mapToInt(Integer::intValue);
		IntStream stream=marks.stream().flatMapToInt(IntStream::of);
		return stream.average().orElse(-1);
	}
	
public static void main(String[] args) throws Exception {
	List<Integer> marks=Arrays.asList(99,98,97,100,92,84,80,89,90);
	System.out.println(calculateAvg(marks));
	System.out.println("Program ends..");
}
}
