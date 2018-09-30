package com;

import java.util.ArrayList;
import java.util.HashMap;

public class Structure {


	static int stateNumbers;
	int  cityId;
	String cityName;
	HashMap<Integer,Integer> conList ;
	
	
	public Structure(int cityId,String cityName) {
		super();
		this.cityId = cityId;
		this.cityName=cityName;
		conList=new HashMap<>();
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getcityId() {
		return cityId;
	}
	public void setcityId(int cityId) {
		this.cityId = cityId;
	}
	public void  addToList(int i,int cost) {
		conList.put(i,cost);
	
	}
	public static int getStateNumbers() {
		return stateNumbers;
	}
	public static void setStateNumbers(int stateNumbers) {
		Structure.stateNumbers = stateNumbers;
	}
	
}
