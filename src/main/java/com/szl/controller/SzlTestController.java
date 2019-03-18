package com.szl.controller;

import com.szl.annaotation.SzlRequestMapping;
import com.szl.annaotation.SzlRequestParameter;
import com.szl.service.SzlTestService;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.szl.annaotation.SzlAutowired;
import com.szl.annaotation.SzlController;

@SzlController("szlTestController")
@SzlRequestMapping("/testPath")
public class SzlTestController {
	
	@SzlAutowired("szltestService")
	private SzlTestService szltestService;
	
    @SzlRequestMapping("query")
	public List<Map<String,Object>> query(HttpServletRequest request,HttpServletResponse response,
			@SzlRequestParameter("age") Integer age,
			@SzlRequestParameter("name") String name){
				return null;
	}
}
