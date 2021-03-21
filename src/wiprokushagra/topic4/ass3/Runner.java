package wiprokushagra.topic4.ass3;

import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
     List<String> sl=StringListDB.getStringList();
     
    // Count no.strings whose length is >= 5
    long val= sl.stream().filter(s-> s.length() >=5).count();
    System.out.println(val);
    
    // Count no.of empty strings
    long zero=sl.stream().filter(s->s.length()==0).count();
    System.out.println(zero);
    
    // filter empty string.
    List<String> str=sl.stream().filter(item-> !item.isEmpty()).collect(Collectors.toList());
    str.forEach(s->System.out.println(s+" "));
    
    // get empty string
    List<String> emp=sl.stream().filter(item->item.length()==0).collect(Collectors.toList());
    emp.forEach(System.out::println);   
    
    // ends
    System.out.println("Program ends");
	}

}
