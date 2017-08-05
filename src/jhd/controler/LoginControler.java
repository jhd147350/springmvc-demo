package jhd.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jhd.entity.User;

@Controller
@SessionAttributes({ "user", "username" })
public class LoginControler {

	@RequestMapping("/mylogin")
	public String login(User user, Model m) {
		if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
			m.addAttribute("username", user.getUsername());
			return "login_suc";
		}
		return "login_fail";

	}

}
