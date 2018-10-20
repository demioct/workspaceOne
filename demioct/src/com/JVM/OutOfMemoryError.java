package com.JVM;

import java.util.ArrayList;
import java.util.List;
//¶ÑÒç³ö
public class OutOfMemoryError {

	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		while(true){
			list.add(new String());
		}
	}

}