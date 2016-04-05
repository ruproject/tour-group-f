/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import model.Person;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
    
    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }
    
    @RequestMapping("/person")    
    public String person(Model m){
        Person p = new Person();
        p.setFirstName("Chuncheong");
        p.setLastName("Tangisarawutikul");
        p.setAge(28);
        m.addAttribute("person", p);
        return "personView";
    }
}
