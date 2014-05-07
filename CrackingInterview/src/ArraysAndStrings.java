import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class ArraysAndStrings {
	
	// 1.1
	
	public boolean uniqueCharacters(String s) {
		boolean result = true;
		char [] chars = new char[s.length()];
		HashMap<Character, Integer> freq = new HashMap<Character,Integer>();
		s.getChars(0, s.length() - 1, chars, 0);
		
		for (Character c : chars) {
			if (freq.get(c) != null) {
				result = false;
				break;
			}
			else freq.put(c, 1);
			
		}
		
		return result;
	}
	
	// 1.3
	
	public boolean permu(String s1, String s2) {
		boolean result = true;
		char [] string1 = new char[s1.length()];
		char [] string2 = new char[s2.length()];
		
		s1.getChars(0, s1.length(), string1, 0);
		s2.getChars(0, s2.length(), string2, 0);
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		if (string1.length != string2.length) {
			result = false;
		}
		else {
			for (int i = 0; i < string1.length; i++) {
				if (string1[i] != (string2[i])) {
					result = false;
					break;
				}
			}
		}
		return result;
		
	}
	
	// 1.5
	
	public String compress(String s) {
//		StringBuffer result = new StringBuffer();
//		char [] chars = new char[s.length()];
//		HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
//		s.getChars(0, s.length(), chars, 0);
//		for (Character c : chars) {
//			if (freq.get(c) != null) {
//				freq.put(c, freq.get(c) + 1);
//			}
//			else freq.put(c, 1);
//		}
//		for (Map.Entry<Character, Integer> entry : Collections.sort(freq.entrySet())) {
//			String add = "" + entry.getKey() + entry.getValue();
//			result.append(add);
//		}
//		if (result.length() < s.length()) {
//			return result.toString();
//		}
//		else return s;
		StringBuffer result = new StringBuffer();
		int l = s.length();
		char [] chars = new char[l];
		s.getChars(0, l, chars, 0);
		char current = chars[0];
		int count = 0;
		for (Character c : chars) {
			if (c.equals(current)) {
				count++;
			}
			else {
				result.append("" + current + count);
				current = c;
				count = 1;
			}
		}
		result.append(""+current+count);
		if (result.length() < l) {
			return result.toString();
		}
		else return s;
	}
	
	// 1.6
	
	
	
	

}
