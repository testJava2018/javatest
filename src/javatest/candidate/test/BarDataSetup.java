package javatest.candidate.test;

import java.util.ArrayList;
import java.util.List;

public class BarDataSetup {

	public static List<Bar> getBarDataCollection(){
		List<Bar> bars=new ArrayList<Bar>();
		
		
		Bar bar1=new Bar();
		
		bar1.setFlag("s");
		bar1.setAgreedFx(0.22);
		bar1.setCurrency("SGP");
		bar1.setIDate("05-JAN-2016");
		bar1.setSDate("07-JAN-2016");
		bar1.setUnits(450);
		bar1.setPriceOfUnit(100.25);
			
		
		Bar bar=new Bar();
		bar.setFlag("s");
		bar.setAgreedFx(0.50);
		bar.setCurrency("SGP");
		bar.setIDate("06-JAN-2016");
		bar.setSDate("07-JAN-2016");
		bar.setUnits(451);
		bar.setPriceOfUnit(151.25);
		
		bars.add(bar);	
		bars.add(bar1);
		
		return bars;
	}
}
