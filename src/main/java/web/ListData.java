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
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Controller
public class ListData {
    
    @RequestMapping("/tour_information")
    public String tourInformation(){
        return "tour_information";
    }
    
    @RequestMapping("/tour_job")
    public String tourJob(){
        return "tour_job";
    }
    
    @RequestMapping("/agent_information")
    public String agentInformation(){
        return "agent_information";
    }
    
    @RequestMapping("/hotel_information")
    public String hotelInformation(){
        return "hotel_information";
    }
    
    @RequestMapping("/hotel_newbooking")
    public String hotelNewbooking(){
        return "hotel_newbooking";
    }
    
    @RequestMapping("/hotel_series")
    public String hotelSeries(){
        return "hotel_series";
    }
    
    @RequestMapping("/hotel_cancel")
    public String hotelCancel(){
        return "hotel_cancel";
    }
    
    @RequestMapping("/hotel_amend")
    public String hotelAmend(){
        return "hotel_amend";
    }
    
    @RequestMapping("/hotel_confirm")
    public String hotelConfirm(){
        return "hotel_confirm";
    }
    
    @RequestMapping("/car_information")
    public String carInformation(){
        return "car_information";
    }
    
    @RequestMapping("/car_newbooking")
    public String carNewbooking(){
        return "car_newbooking";
    }
    
    @RequestMapping("/car_series")
    public String carSeries(){
        return "car_series";
    }
    
    @RequestMapping("/car_cancel")
    public String carCancel(){
        return "car_cancel";
    }
    
    @RequestMapping("/car_amend")
    public String carAmend(){
        return "car_amend";
    }
    
    @RequestMapping("/car_confirm")
    public String carConfirm(){
        return "car_confirm";
    }   
       
    @RequestMapping("/restaurant_information")
    public String restaurantInformation(){
        return "restaurant_information";
    }
    
    @RequestMapping("/restaurant_newbooking")
    public String restaurantNewbooking(){
        return "restaurant_newbooking";
    }
    
    @RequestMapping("/restaurant_series")
    public String restaurantSeries(){
        return "restaurant_series";
    }
    
    @RequestMapping("/restaurant_cancel")
    public String restauranthotelCancel(){
        return "restaurant_cancel";
    }
    
    @RequestMapping("/restaurant_amend")
    public String restaurantAmend(){
        return "restaurant_amend";
    }
    
    @RequestMapping("/restaurant_confirm")
    public String restaurantConfirm(){
        return "restaurant_confirm";
    }
    
    @RequestMapping("/location_information")
    public String locationInformation(){
        return "location_information";
    }
    
    @RequestMapping("/location_newbooking")
    public String locationNewbooking(){
        return "location_newbooking";
    }
    
    @RequestMapping("/location_series")
    public String locationSeries(){
        return "location_series";
    }
    
    @RequestMapping("/location_cancel")
    public String locationCancel(){
        return "location_cancel";
    }
    
    @RequestMapping("/location_amend")
    public String locationAmend(){
        return "location_amend";
    }
    
    @RequestMapping("/location_confirm")
    public String locationConfirm(){
        return "location_confirm";
    }
    
    @RequestMapping("/report_information")
    public String reportInformation(){
        return "report_information";
    }
    
}
