/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import javax.servlet.http.*;
import model.User;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;


@Controller
public class WebController {
    
    SessionFactory factory = new Configuration()
		// .addPackage("entity")
		.addAnnotatedClass(User.class)
		.buildSessionFactory();
    
    @RequestMapping("/")
    public String root(){
        return "login";
    }
    
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
        
    @RequestMapping("/index")
    public String index(){
        return "index";
    }       
      
    @RequestMapping(value="/", method=RequestMethod.POST)
	String login(HttpSession session, String user_name, String user_pwd) {
	Session database = factory.openSession();
	Query query = database.createQuery(
		"from User where user_name = :user_name and user_pwd = :user_pwd");
	query.setParameter("user_name", user_name);
	query.setParameter("user_pwd", encode(user_pwd));
	List list = query.list();
            if (list.size() == 1) {
		User user = (User)list.get(0);
		session.setAttribute("user", user);
		database.close();
                return "redirect:/index";
            } else {
		return "login";
            }
	}
    
    @RequestMapping("/logout")
	String logout(HttpSession session) {
            session.removeAttribute("user");
            session.invalidate();
    	return "redirect:/";
	}
    
    String encode(String s) {
	String result = "";
	try {
            java.security.MessageDigest digest = java.security.
		MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(s.getBytes("UTF-8"));
		for (int i = 0; i < hash.length; i++) {
                    String hex = Integer.toHexString(0xff & hash[i]);
                    if (hex.length() == 1)
		result += '0';
		result += hex;
		}
            } catch (Exception e) {}
		return result;
    }
    
    
    
    

}
