package com.jjw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/** 
* @ClassName: UserController 
* @Description:(你猜猜看...) 
* @author jjw
* @date 2018年5月31日 下午7:32:14  
*/
@RequestMapping("/user")
@RestController
public class UserController {
	
	private final  static Logger log = LoggerFactory.getLogger(UserController.class);
	
	/**
	* @Title: showPage 
	* @Description:页面跳转
	* @author jjw
	* @param @param page
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping("/{page}")//使用restful
	public String showPage(@PathVariable String page){
		return page;
	}
	
	@RequestMapping("queryStudent")
	public String selectStudent(){
		log.info("queryStudent start");
		return "queryStudent...";
	}
	
}
