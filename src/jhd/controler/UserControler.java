package jhd.controler;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jhd.service.UserService;

@Controller
@RequestMapping("/user")
public class UserControler {

	// @Autowired
	// UserService userService;

	@ResponseBody
	@RequestMapping(value = "find", method = RequestMethod.GET)
	public String getUser(/*HttpServletRequest request,HttpServletResponse response*/ ) {
		/*try {
			//response.getWriter().write("1212121212122json");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return "123345555";
	}

}
