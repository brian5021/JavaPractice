import static org.junit.Assert.*;

import org.junit.Test;


public class TestWork {
	ArraysAndStrings testArray = new ArraysAndStrings();
	LinkedLists testLink = new LinkedLists();
	
	@Test
	public void testArray1() {
		
		String d1 = "Hello";
		String d2 = "qwertasdfgzxcvcbdgs";
		String u1 = "qazwsxedcrfvtgbyhnujmiklop";
		String u2 = "qwertyuiopasdfghjklzxcvbnm";
		assertTrue(testArray.uniqueCharacters(u1));
		assertTrue(testArray.uniqueCharacters(u2));
		assertFalse(testArray.uniqueCharacters(d1));
		assertFalse(testArray.uniqueCharacters(d2));
	}
	
	@Test 
	public void testArray3() {
		String permie1 = "wasted";
		String permie1m = "stewad";
		String nonpermie = "qwerty";
		
		assertTrue(testArray.permu(permie1, permie1m));
		assertFalse(testArray.permu(permie1, nonpermie));
	}
	
	@Test
	public void testArray5() {
		String comp1 = "aaaabbbccd";
		String comp2 = "abbcccdddd";
		String comp3 = "aabcd";
		String result1 = "a4b3c2d1";
		String result2 = "a1b2c3d4";
		String result3 = "aabcd";
		
		System.out.println(testArray.compress(comp1));
		System.out.println(testArray.compress(comp2));
		System.out.println(testArray.compress(comp3));
		
		assertEquals(testArray.compress(comp1), result1);
		assertEquals(testArray.compress(comp2), result2);
		assertEquals(testArray.compress(comp3), result3);
	}

}
