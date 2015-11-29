package com.hd.aop.aspectj.biz;

import org.springframework.stereotype.Service;

import com.hd.spring.HDMethod;

@Service
public class HDBiz {

	@HDMethod("HDBiz save with HDMethod.")
	public String save(String arg) {
		System.out.println("HDBiz save : " + arg);
		// throw new RuntimeException(" Save failed!");
		return " Save success!";
	}

}
