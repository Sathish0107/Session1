package com.testNG;

import org.testng.annotations.Test;

public class PrioritySession03 {

	@Test
	public void c_method() {
		System.out.println("I'm in method C");
	}

	@Test(enabled = false)
	public void b_method() {
		System.out.println("I'm in method B");
	}

	@Test(priority = 1)
	public void a_method() {
		System.out.println("I'm in method A");
	}

	@Test(priority = 9)
	public void e_method() {
		System.out.println("I'm in method E");
	}

	@Test(priority = 2)
	public void d_method() {
		System.out.println("I'm in method D");
	}
}
