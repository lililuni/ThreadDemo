
package com.thread.ThreadPoolDemo.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.thread.ThreadPoolDemo.service.AsyncService;

import lombok.extern.slf4j.Slf4j;

/**
* @Description 
* @since  2019年6月5日 下午1:43:22
* @author LiuLiBin
*/
@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService {
	
	
	
	@Override
	@Async("asyncServiceExecutor")
	public void executeAsync() {
		
		 log.info("start executeAsync"); 
		 
		 try{ 
			
			 Thread.sleep(10000); 
		 }catch(Exception e){ 
			 e.printStackTrace(); 
		 } 
		 
		 log.info("end executeAsync");
		 
		
	}

}
