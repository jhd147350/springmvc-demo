package jhd.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticControler {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String redirect() {

		return "redirect:/pages/final.html";
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect1() {

		return "redirect:final1";
	}
	
	@RequestMapping(value = "/final1", method = RequestMethod.GET)
	public String finalpage() {

		return "final2";
	}

}
