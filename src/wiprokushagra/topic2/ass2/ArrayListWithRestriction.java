package wiprokushagra.topic2.ass2;

import java.util.List;

public class ArrayListWithRestriction {
public static void main(String[] args) {
	List<Object> list=new MyArrayList<>();
	
	try {
	list.add(20);
	list.add(5.2F);
	list.add(3.1415D);
	list.add("hello");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		e.getStackTrace();
	}

	list.forEach(val-> System.out.println(val));

}
}
