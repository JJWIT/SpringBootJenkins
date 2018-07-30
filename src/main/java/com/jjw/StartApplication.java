/**   
* @Title: StartApplication.java 
* @Package commons 
* @Description: TODO(你猜猜看...) 
* @author jjw
* @date 2018年5月22日 下午6:07:06 
* @version V1.0   
*/
package com.jjw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
* @ClassName: StartApplication 
* @Description:启动类，注意启动器默认扫描当前包下的controller。一定要和controller在同一个包下，否则需要使用@ComponentScan包中。
* @author jjw
* @date 2018年5月22日 下午6:07:06  
*/

@SpringBootApplication
public class StartApplication {
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}
