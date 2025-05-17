package etc;

import java.util.*;

/*
 * ArrayList_Genelic test
 * 
 * */
public class ArrayList_Genelic   {
	
	
	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<String>();

		arrList.add("Spri11ngBoot");
		arrList.add("Node.js");
		arrList.add("Django");
		arrList.add("Ruby on Rails");
		arrList.add("Laravel");

		for (Object arr : arrList) {
			String test_1 = main2(arr);
			System.out.println("test_1 "+test_1);
		}
		
		String test_2 =Arr.main3("44");
		System.out.println("test_2 "+test_2);
		
		
		
		List<HashMap<String, String>> arrList2 = new ArrayList<HashMap<String, String>>();

		for (int i = 0; i < 3; i++) {
			HashMap<String, String> mmap = new HashMap<String, String>();
			mmap.put("1" + i, "a");
			mmap.put("2" + i, "b");
			mmap.put("3" + i, "c");
			mmap.put("4" + i, "d");
			arrList2.add(mmap);
		}

		for (HashMap<String, String> c : arrList2) {
			System.out.println(c.entrySet());
		}

	}

	public static <T> String main2(T t) {
		System.out.println(t);
		String a = t + "1";
		return a;
	}
}

class Arr<T> {
	public static <T> String main3(T t) {
		System.out.println(t);
		String a = t + "1";
		return a;
	}
}