package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class MainClass {



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);  
			System.out.println("EnterCity1");
			String cityDepart=sc.next();  
		 
			System.out.println("EnterCity2");
			String cityArrive=sc.next();  
			Structure[] cityNode=new Structure[40];
			cityNode[1]=new Structure(1,cityArrive);
			cityNode[0]=new Structure(0,cityDepart);
			
			Map<String,Structure> listCity=new HashMap<>();
			
			
			listCity.put(cityArrive,cityNode[1]);
			listCity.put(cityDepart,cityNode[0]);
			
			
			
			
			
			
			System.out.println("Enter N lines");
			int N=sc.nextInt();
			
			System.out.println("Enter Next-City connected ");
			int cityIndex=2;
			for(int i=0;i<N;i++)
			{
				Structure citySA=null,citySB=null;
				String cityA=sc.next();
				String cityB=sc.next();
				
				if(!listCity.containsKey(cityA))
				{
					cityNode[cityIndex]=new Structure(cityIndex,cityA);
					citySA=cityNode[cityIndex];
					listCity.put(cityA, citySA);
					cityIndex++;
				}else
				{
					 citySA=listCity.get(cityA);
				
				}
				
				if(!listCity.containsKey(cityB))
				{
					cityNode[cityIndex]=new Structure(cityIndex,cityB);
					
					citySB=cityNode[cityIndex];
					listCity.put(cityB, citySB);
					cityIndex++;
				}
				else
				{
					 citySB=listCity.get(cityB);
				
				}
				System.out.println("Enter Cost:");
				int cost=sc.nextInt();
				citySA.addToList(citySB.cityId,cost);
			}
			
			
//			for(Structure s: listCity.values())
//			{
//				System.out.println("city "+s.cityId);
//				System.out.println(s.conList.keySet());
//				
//			}		
			
			///core logic
			
			
			
			
			
			 	boolean[] isVisited = new boolean[listCity.size()]; 
		        ArrayList<Integer> pathList = new ArrayList<>(); 
		 
		        pathList.add(0); 
		       
		        printAllPathsUtil(0, 1, isVisited, pathList,cityNode); 
		        
		  
		        
		        
		        
	
	}

	public static void finalAns(List<Integer> ansList)
	{
		
	}
	public static void printAllPathsUtil(Integer u, Integer d, 
            boolean[] isVisited, 
    List<Integer> localPathList,Structure[] cityNode) { 
	
		isVisited[u] = true; 
		
		if (u.equals(d))  
		{ 
			int cost=0;
			//System.out.println(localPathList); 
			
			for(int i=0;i<localPathList.size();i++){
				
				System.out.print(cityNode[localPathList.get(i)].cityName+" ");
				if(i<localPathList.size()-1)
					cost=cost+cityNode[localPathList.get(i)].conList.get(localPathList.get(i+1));
				
				
			}
			System.out.println(cost); 
			
			
		} 
		
		for (Integer i : cityNode[u].conList.keySet())  
		{ 
			if (!isVisited[i]) 
			{ 
			//cost=cityNode[u].conList.get(i)+cost;
			localPathList.add(i); 
			
			printAllPathsUtil(i, d, isVisited, localPathList,cityNode); 
			
			localPathList.remove(i); 
			
			} 
		} 
		isVisited[u] = false; 
	
		} 
				
				
			
	}


