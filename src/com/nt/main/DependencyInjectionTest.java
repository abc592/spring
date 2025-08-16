package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// create IOC container
		
	FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	Object obj = ctx.getBean("wmg");
	WishMessageGenerator generator = (WishMessageGenerator)obj;
	String result = generator.showWishMessage("Srikanth");
			System.out.println(result);

	}

}
