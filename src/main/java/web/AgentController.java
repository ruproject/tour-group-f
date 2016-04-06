/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgentController {
    
    @RequestMapping("/agent_information")
    public String agentInformation(){
        return "agent_information";
    }
    
    @RequestMapping("/agent_information_add")
    public String agentInformationAdd(){
        return "agent_information_add";
    }
}
