package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
        
        @RequestMapping("/")
        public String root(){
            return "index";
        }
        
        @RequestMapping("/index")
        public String index(){
            return "index";
        }
        
        @RequestMapping("/login")
        public String login(){
        return "login";
    }
}
