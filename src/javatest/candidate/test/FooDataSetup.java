package javatest.candidate.test;

import java.util.ArrayList;
import java.util.List;

public class FooDataSetup {
	
	
	public static List<Foo> getFooDataCollection(){
		List<Foo> foodatas=new ArrayList<Foo>();
				
		Foo foo1=new Foo();
		foo1.setFlag("s");
		foo1.setAgreedFx(0.51);
		foo1.setCurrency("SGP");
		foo1.setIDate("02-JAN-2016");
		foo1.setSDate("02-JAN-2016");
		foo1.setUnits(201);
		foo1.setPriceOfUnit(100.25);
		
		Foo foo=new Foo();
		foo.setFlag("s");
		foo.setAgreedFx(0.50);
		foo.setCurrency("SGP");
		foo.setIDate("01-JAN-2016");
		foo.setSDate("02-JAN-2016");
		foo.setUnits(200);
		foo.setPriceOfUnit(101.25);
		
		foodatas.add(foo);	
		foodatas.add(foo1);
		
		return foodatas;
	}
	
}
