package rhb.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.test_dubbo_api.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		try {
			return name + " request,response is :"+InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String sysInfo() {
		StringBuffer sb = new StringBuffer();
		Properties properties = System.getProperties();
		Set<Entry<Object,Object>> entrySet = properties.entrySet();
		for(Entry<Object,Object> entry : entrySet) {
			sb.append(entry.getKey().toString()+"-"+entry.getValue()+"\n");
		}
		return sb.toString();
	}

}
