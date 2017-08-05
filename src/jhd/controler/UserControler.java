package jhd.controler;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jhd.entity.User;
import jhd.service.UserService;

@Controller
@RequestMapping("/user")
public class UserControler {

	// @Autowired
	// UserService userService;

	
	@RequestMapping(value = "find", method = RequestMethod.GET)
	public String getUser(/* HttpServletRequest request,HttpServletResponse response */ ) {
		/*
		 * try { //response.getWriter().write("1212121212122json"); } catch (IOException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 */
		/*User u=new User();
		u.setPassword("1234");
		u.setUsername("jia");*/
	
		return "user";
	}
	
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String addUser(User u,ModelMap mm) {
		
		mm.addAttribute("username", u.getUsername());
		mm.addAttribute("password", u.getPassword());
		
		
		return "result";
	}

	public void startThread() {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 0;
				// TODO Auto-generated method stub
				while (true) {
					try {
						Thread.sleep(1000);
						System.out.println(i++);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
		
		t.start();
	}

}
