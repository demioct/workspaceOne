package com.JVM;

public class GC {

	public static GC A_a = null;
	
	public void say(){
		System.out.println("i am alive");
		
	}
	
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("fangfa is zhixing ing");
		GC.A_a = this;
	}
	
	public static void main(String[] args) throws Throwable {
		A_a = new GC();
		
		A_a = null;
		System.gc();
		Thread.sleep(500);
		if(A_a != null){
			A_a.say();
		}else{
			System.out.println("i am die");
		}
		
		
		
		A_a = null;
		System.gc();
		Thread.sleep(500);
		if(A_a != null){
			A_a.say();
		}else{
			System.out.println("i am die");
		}
	}
}
