package com;

import java.util.ArrayList;
import java.util.List;

public class Output {
	List<Integer> lst;
	List<String> lststr;
	int cost;
	public List<Integer> getLst() {
		return lst;
	}
	public void setLst(List<Integer> lst) {
		this.lst = lst;
	}
	
	public Output(List<Integer> lst,int cost) {
		
		super();
		lst=new ArrayList<>();
		lststr=new ArrayList<>();
	
		this.cost=cost;
		
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
}
