package javatest.candidate.testest;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javatest.candidate.test.Bar;
import javatest.candidate.test.BarDataSetup;
import javatest.candidate.test.Foo;
import javatest.candidate.test.FooDataSetup;
import javatest.candidate.test.RankEntity;

public class CalculateReport {
	
	public void setteledOutGoingFoo(RankEntity rank){
		List<Foo> list=FooDataSetup.getFooDataCollection().stream()
				.sorted(Comparator.comparing(Foo::getIDate, (date1,date2)->{
			if(null!=date1 && null!=date2){
				return date1.compareTo(date2);
			}else{
				return -1;
			}
		})).collect(Collectors.toList());
		
		list.stream().forEach(foo-> {
			double totalAmount=0;
			double usdAmntFoo=foo.getPriceOfUnit()*foo.getUnits()*foo.getAgreedFx();
			System.out.println("Outgoing values are printing....." +usdAmntFoo);
			totalAmount=totalAmount+usdAmntFoo;
			rank.setTotalFooAmount(totalAmount);
		} );	
	}	
	
	public void setteledIncomingBar(RankEntity rank){
		List<Bar> list=BarDataSetup.getBarDataCollection().stream()
				.sorted(Comparator.comparing(Bar::getIDate, (date1,date2)->{
			if(null!=date1 && null!=date2){
				return date1.compareTo(date2);
			}else{
				return -1;
			}
		})).collect(Collectors.toList());
		
		list.stream().forEach(foo-> {
			double totalAmount=0;
			
			double usdAmntFoo=foo.getPriceOfUnit()*foo.getUnits()*foo.getAgreedFx();
			totalAmount=totalAmount+usdAmntFoo;
			rank.setTotalBarAnount(totalAmount);
			System.out.println("Incoming values are printing....." +usdAmntFoo);
		} );
		
	}	
	public void getHigherRank(RankEntity rank){
		
		double totalDifference=rank.getTotalFooAmount() - rank.getTotalFooAmount();
		
		if(Math.abs(totalDifference-1.0) <= 0.000001){
			rank.setFooRank(1);
			System.out.println("Foo Higher Rank-" + rank.getFooRank());
		}else{
			rank.setBarRank(1);
			System.out.println("Bar Higher Rank-" + rank.getBarRank());
		}
	}
	
	public static void main(String[] args) {
		RankEntity rank = new RankEntity();
		new CalculateReport().setteledOutGoingFoo(rank);
		new CalculateReport().setteledIncomingBar(rank);
		new CalculateReport().getHigherRank(rank);
									
	}		

}
