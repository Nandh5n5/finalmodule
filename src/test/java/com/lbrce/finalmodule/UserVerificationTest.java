package com.lbrce.finalmodule;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserVerificationTest {
	UserVerification uv=new UserVerification();
	@Test
	public void testcase1() {
		Assert.assertEquals(true,uv.check("nandini","nandini@9"));
	}
	@Test
	public void testcase2() {
		Assert.assertEquals(false,uv.check("nandini","nandini@8"));
	}
	@Test
	public void testcase3() {
		Assert.assertEquals(false,uv.check("nandini","nandini@7"));
	}
	@Test
	public void testcase4() {
		Assert.assertEquals(false,uv.check("nandini","nandini@6"));
	}
}
