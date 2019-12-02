package com.ustglobal.webapp1.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.webapp1.beans.Retailer;
import com.ustglobal.webapp1.repo.RetailerService;

@Controller
public class RetailerController {
@Autowired
private RetailerService service;

@GetMapping("/login")
public String loginPage() {
	return "login";
}
@PostMapping("/login")
public String login(int id,String password,HttpServletRequest request)
{
	Retailer bean = service.login(id, password);
	if(bean==null)
	{
		request.setAttribute("msg", "InvalidCredentials");
		return "login";
	}
	else{
		HttpSession session = request.getSession();
		session.setAttribute("bean", bean);
		return "home";
	}
}

@GetMapping("/register")
public String register(){
	return "register";
}//end of register



@PostMapping("/register")
public String register(Retailer bean , ModelMap map ){
	int check = service.createProfile(bean);
	if (check>0) {
		map.addAttribute("msg", "you are registered and id is "+check);

	} else {
		map.addAttribute("msg", "email is repeated");
	}
	return "login";
}//end of register



@GetMapping("/home")
public String home(ModelMap map,@SessionAttribute(name="bean",required=false)Retailer bean)
{
	if (bean==null) {
		map.addAttribute("msg", "LoginFirst");
		return "login";
	} else {
		return "home";
	}
}// end of home



public String home() {
	return "home";
}//end of home()



@GetMapping("/search")
public String search(@RequestParam("id")int id,ModelMap map) {
	Retailer bean = service.searchProducts(id);
	if (bean==null) {
		map.addAttribute("msg", "data not found");
	} else {
		map.addAttribute("bean", bean);
	}
	return "home";
}

@GetMapping("/logout")
public String logout(HttpSession session) {
	session.invalidate();
	return "login";
}//end of logout


@GetMapping("/changepassword")
public String ChangePassword(HttpServletRequest request){
	HttpSession session = request.getSession(false);
	if(session!=null)
	{
		return "changepassword";
	}
	else
	{
		return "login";
	}

}
@PostMapping("/changepassword")
public String changepassword(String password,String confirmpassword,@SessionAttribute(name="bean")Retailer bean,ModelMap map)
{
	if(password.equals(confirmpassword))
	{
		service.changePassword(bean.getId(), password);
		map.addAttribute("msg","Password Changed");
	}
	else
	{
		map.addAttribute("msg", "password not matching");
	}
	return "home";
}



}
