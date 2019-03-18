package com.szl.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.szl.annaotation.SzlService;
import com.szl.service.SzlTestService;

@SzlService("szlTestService")
public class SzlTestServiceImpl implements SzlTestService{

	public List<Map<String, Object>> query(String age,String name) {
		 List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		 Map<String, Object> map = null;
		 for(int i =0;i<=10;i++){
			 map = new HashMap<String, Object>();
			 map.put(age, i);
			 map.put(name, i);
			 list.add(map);
		 }
		return list;
	}
	

}
