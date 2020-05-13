package Lists;

import java.util.*;

public class Lists {

	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<String>();
	list.add("sai");
	list.add("niku");
	list.add("kiki");
	list.add("pikki");
	list.add("nikki");
	
	Iterator itr =  list.iterator();
	
	while(itr.hasNext()) {
	
	System.out.println(itr.next());
	}
	}

}
