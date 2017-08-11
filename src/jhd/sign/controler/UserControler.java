package jhd.sign.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jhd.sign.service.UserService;
import jhd.sign.service.UserServiceImp;

@Controller
@RequestMapping("/user")
public class UserControler {

	@Autowired
	@Qualifier("userService")
	private UserService service;//=new UserServiceImp();

	@RequestMapping("/login")
	public String login() {
		return "sign/login";
	}

	@RequestMapping(value = "/dologin", method = RequestMethod.POST)
	public String doLogin(String username, String password, Model m) {

		if (service.login2(username, password)) {
			return "main";
		}
		return "redirect:/index.jsp";
	}

}
