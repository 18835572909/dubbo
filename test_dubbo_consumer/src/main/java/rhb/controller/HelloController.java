package rhb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test_dubbo_api.HelloService;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class HelloController {
	
	@Reference
	private HelloService helloService;
	
	@RequestMapping("/sayHello")
	public String sayHello(String name) {
		return helloService.sayHello(name);
	}
	
	@RequestMapping("/sysInfo")
	public String sysInfo() {
		return helloService.sysInfo();
	}
}
