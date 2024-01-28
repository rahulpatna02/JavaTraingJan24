package com.traing.main;

public class B {
	public String b = "value";
	public B(){
		b = "changed";
		System.out.print("B object created");
	}
	
	public B(String b){
		this.b = b;
		System.out.print("B object created");
	}

}
