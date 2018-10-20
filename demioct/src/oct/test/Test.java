package oct.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		List<List<String>> fatherList = new LinkedList<>();
		List<String> childrenList = new ArrayList<>();
		childrenList.add("begin");
		fatherList.add(childrenList);
		childrenList.add("end");
		//System.out.println(fatherList);
		
		
		String s1 = "begin";
		String s2 = "end";
		change(s1,s2);
		System.out.println(s1 + "---" + s2);
	}
	public static void change(StringBuffer sb1,StringBuffer sb2){
		sb1 = sb2;
		sb2.append(sb1);
	}
	public static void change(String s1,String s2){
		s1 = s2;
		s2 = s1 + s2;
	}
}
