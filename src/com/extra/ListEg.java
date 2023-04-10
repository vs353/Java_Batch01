package com.extra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class ListEg {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("salo");
		list.add(10);
		System.out.println(list);
//		Map map = new ArrayList();
//		System.out.println(map);
		/*
		 * Set lists = new ArrayList(); lists.add("bellcy");
		 */
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.hasNext());
			
			/*
			 * Collection c = map.values(); while(c.hasNext()) {
			 * System.out.println(c.hasNext()); }
			 */
		}
	}

}
