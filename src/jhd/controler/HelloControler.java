package jhd.controler;

import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jhd.entity.User;

@Controller
@RequestMapping("/hello")
public class HelloControler {

	//ModelMap m, Model m1, Map<String,String> map 的使用
	//http://blog.csdn.net/zb0567/article/details/7921155
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap m, Model m1, Map<String,String> map) {
		User user = new User();
		user.setUsername("jiahaodong");
		user.setPassword("111111");

		m.addAttribute("user", user);
		m.put("user1", user);
		m1.addAttribute("user2", user);
		
		map.put("map","this is map");
		return "hello";
	}

}
