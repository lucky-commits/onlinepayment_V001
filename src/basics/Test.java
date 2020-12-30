package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> mobiles = new ArrayList<>();
	    mobiles.add("Redmi");
	    mobiles.add("Realme");
	    mobiles.add("Samsung");
	    mobiles.add("Apple");
	    

	    // printing ArrayList before removing any element
	    System.out.println(mobiles);

	    // removing element using ArrayList's remove method during iteration
	    // This will throw ConcurrentModification

	   /* for (String phone : mobiles) {
	      if (phone.equals("Redmi")) {
	        mobiles.remove(phone);
	      }
	}*/

	
	    Iterator<String> itr = mobiles.iterator();
	    while (itr.hasNext()) {
	      String phone = itr.next();
	      if (phone.equals("Redmi")) {
	        itr.remove();

	    // printing ArrayList after removing an element
	    System.out.println(mobiles);
	  }


	    }
	}
}
	

