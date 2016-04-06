/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
    
    @RequestMapping("/car_information")
    public String carInformation(){
        return "car_information";
    }
    
    @RequestMapping("/car_information_add")
    public String carInformationAdd(){
        return "car_information_add";
    }
    
    @RequestMapping("/car_newbooking")
    public String carNewbooking(){
        return "car_newbooking";
    }
    
    @RequestMapping("/car_newbooking_add")
    public String carNewbookingAdd(){
        return "car_newbooking_add";
    }
    
    @RequestMapping("/car_series")
    public String carSeries(){
        return "car_series";
    }
    
    @RequestMapping("/car_series_add")
    public String carSeriesAdd(){
        return "car_series_add";
    }
    
    @RequestMapping("/car_cancel")
    public String carCancel(){
        return "car_cancel";
    }
    
    @RequestMapping("/car_cancel_add")
    public String carCancelAdd(){
        return "car_cancel_add";
    }
    
    @RequestMapping("/car_amend")
    public String carAmend(){
        return "car_amend";
    }
    
    @RequestMapping("/car_amend_add")
    public String carAmendAdd(){
        return "car_amend_add";
    }
    
    @RequestMapping("/car_confirm")
    public String carConfirm(){
        return "car_confirm";
    }
    
    @RequestMapping("/car_confirm_add")
    public String carConfirmAdd(){
        return "car_confirm_add";
    }
}
