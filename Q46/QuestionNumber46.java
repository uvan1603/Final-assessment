package com.springboot.demo.mycoolapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class QuestionNumber46 {
	
	  public static List<List<String>> list(String[] string){
	        List<List<String>> result=new ArrayList<>();
	        HashMap<String,List<String>> map=new HashMap<>();
	        for(String str:string) {
	            char[] cha=str.toCharArray();
	            Arrays.sort(cha);
	            String key=new String(cha);
	            if(map.containsKey(key)) {
	                map.get(key).add(str);
	            }
	            else {
	                List<String> stringList=new ArrayList<>();
	                stringList.add(str);
	                map.put(key, stringList);
	            }
	        }
	        result.addAll(map.values());
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] string= {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res=list(string);
        res.forEach(s->System.out.println(s+""));
    

	}

}
