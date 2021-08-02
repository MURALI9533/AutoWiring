package com.anntn;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	//@Autowired
	private B b;
	
	public B getB() {
		return b;
	}
	//@Autowired
	public void setB(B b) {
		this.b= b;
		System.out.println("setB()");
	}
	public A() {
		System.out.println("default constructor of A");
	}
	//@Autowired
	public A(B b) {
		this.b=b;
		System.out.println("Arrgument constructor");
	}
	@Autowired
	public void fun(B b) {
		System.out.println("inside arbitary  fun() method of A");
		this.b=b;
	}

}
