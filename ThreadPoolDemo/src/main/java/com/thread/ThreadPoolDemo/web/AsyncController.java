
package com.thread.ThreadPoolDemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thread.ThreadPoolDemo.service.AsyncService;

import lombok.extern.slf4j.Slf4j;

/**
* @Description 
* @since  2019年6月5日 下午2:15:30
* @author LiuLiBin
*/
@Slf4j
@RestController
@RequestMapping("async")
public class AsyncController {
	
	@Autowired
	AsyncService  asyncService; 
	
	@GetMapping("/test")
	public void executeAsync() {
		log.info("start controller"); 
		
		asyncService.executeAsync();
		
		log.info("end controller"); 
		
	}
}
