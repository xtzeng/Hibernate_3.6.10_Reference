package com.xme.excel;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.Test;

public class ForEachCollectionsTest {

	@Test
	public void testForeach() {
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "Take the long way home".split(" "));
		
		for(String s : cs){
			System.out.println("【】"+s);
		}
	}
	
	
}
