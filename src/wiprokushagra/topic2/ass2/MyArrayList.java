package wiprokushagra.topic2.ass2;

import java.util.ArrayList;

class MyArrayList<Kush> extends ArrayList<Kush>{
	
@Override
public boolean add(Kush e) {
	if(e instanceof Integer || e instanceof Float || e instanceof Double) {
		super.add(e);
		return true;
	}else {
		throw new ClassCastException("Only int, float and double allowed.");
	}
}
}
