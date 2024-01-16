package com.code.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Practise {
	
	
	public List<Integer> twoSum(int[] nums,int traget) {
	
		HashMap<Integer,Integer> obj=new HashMap<>();
		//int[] actArray=null;
	int i,search;
	List<Integer> numTar=new ArrayList<>();
	List<Integer> numTa=new ArrayList<>();
	List<Integer> mergList=new ArrayList<>();
	
	for( i=0;i<nums.length;i++) {
		search=traget - nums[i];
		if(obj.containsValue(search)) {
			System.out.println("========"+nums[i]+ "and"+ search);
			numTar.add(nums[i]);
			numTa.add(search);
		}else {
			obj.put(i,nums[i]);
			System.out.println(i);
			System.out.println(nums[i]);
			System.out.println("===============");
		}
		
	}
	mergList.addAll(0, numTar);
	mergList.addAll(1, numTa);
		for(Integer gj:mergList) {
			
			System.out.println(gj.intValue());
		}
		try {
			int e;
			int[]acArr=new int [mergList.size()];
			
			for (int n = 0 ; n < acArr.length ; n++){
				acArr[n] = mergList.get(i);
	        }
			 for ( e = 0 ; e < acArr.length ; e++){
		            System.out.print(acArr[e] + "  ");
		        }
			
		}catch(Exception e) {
			
		}
		
		
	return mergList;
	
}


public static void main(String[] args)
{
	String s="Deepak";
	Practise se=new Practise();
	int[] numsArray= {3,4,2,6,7};
	List<Integer> li=se.twoSum(numsArray, 8);
	
	System.out.println("final ================="+li.toArray());
}	




}
