package com.JVM;

//虚拟机栈和本地方法栈溢出
public class StackOverFlowError {

	private int i=0;
	
	public void a(){
		i++;
		a();
	}
	public static void main(String[] args) {
		StackOverFlowError s = new StackOverFlowError();
		try{
			
			s.a();
		}catch(Exception e){
			System.out.println(s.i);
		}
		
	}
}
