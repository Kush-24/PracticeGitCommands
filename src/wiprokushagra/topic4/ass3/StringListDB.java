package wiprokushagra.topic4.ass3;

import java.util.ArrayList;
import java.util.List;

public class StringListDB {

public static List<String> getStringList(){
	List<String> list=new ArrayList<>();
	list.add(new String("first"));
	list.add(new String("second"));
	list.add(new String("third"));
	list.add(new String("fourth"));
	list.add(new String("KushagraYadav"));
	list.add(new String(""));
	
	return list;
}
}
