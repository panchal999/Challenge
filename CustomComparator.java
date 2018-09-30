package com;

import java.util.Comparator;

public class CustomComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Output op1=(Output)o1;
		Output op2=(Output)o2;
		if(op1.cost==op2.cost)
		{
			int i=0;
			if(op1.lst.size()==op2.lst.size())
			{
				while(!op1.lststr.get(i).equals(op2.lststr.get(i)))
				{
					return op1.lststr.get(i).compareTo(op2.lststr.get(i));
				}
				return 1;
			}else if(op1.lst.size()>op2.lst.size())
			{
				return 1;
			}else
			{
				return -1;
			}
			
			
		}else if(op1.cost>op2.cost)
		{
			return 1;
		}else
		{
			return -1;
		}
		
		
		
	}

}
