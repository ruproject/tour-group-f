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
public class AddData {
            
    @RequestMapping("/tour_information_add")
    public String tourInformationAdd(){
        return "tour_information_add";
    }
    
    @RequestMapping("/tour_job_add")
    public String tourJobAdd(){
        return "tour_job_add";
    }
    
    @RequestMapping("/agent_information_add")
    public String agentInformationAdd(){
        return "agent_information_add";
    }
    
    @RequestMapping("/hotel_information_add")
    public String hotelInformationAdd(){
        return "hotel_information_add";
    }
    
    @RequestMapping("/hotel_newbooking_add")
    public String hotelNewbookingAdd(){
        return "hotel_newbooking_add";
    }
    
    @RequestMapping("/hotel_series_add")
    public String hotelSeriesAdd(){
        return "hotel_series_add";
    }
    
    @RequestMapping("/hotel_cancel_add")
    public String hotelCancelAdd(){
        return "hotel_cancel_add";
    }
    
    @RequestMapping("/hotel_amend_add")
    public String hotelAmendAdd(){
        return "hotel_amend_add";
    }
    
    @RequestMapping("/hotel_confirm_add")
    public String hotelConfirmAdd(){
        return "hotel_confirm_add";
    }       
    
    @RequestMapping("/car_information_add")
    public String carInformationAdd(){
        return "car_information_add";
    }    
        
    @RequestMapping("/car_newbooking_add")
    public String carNewbookingAdd(){
        return "car_newbooking_add";
    }
            
    @RequestMapping("/car_series_add")
    public String carSeriesAdd(){
        return "car_series_add";
    }
            
    @RequestMapping("/car_cancel_add")
    public String carCancelAdd(){
        return "car_cancel_add";
    }
            
    @RequestMapping("/car_amend_add")
    public String carAmendAdd(){
        return "car_amend_add";
    }
            
    @RequestMapping("/car_confirm_add")
    public String carConfirmAdd(){
        return "car_confirm_add";
    }
    
    @RequestMapping("/restaurant_information_add")
    public String restaurantInformationAdd(){
        return "restaurant_information_add";
    }
        
    @RequestMapping("/restaurant_newbooking_add")
    public String restaurantNewbookingAdd(){
        return "restaurant_newbooking_add";
    }
            
    @RequestMapping("/restaurant_series_add")
    public String restaurantSeriesAdd(){
        return "restaurant_series_add";
    }   
        
    @RequestMapping("/restaurant_cancel_add")
    public String restaurantCancelAdd(){
        return "restaurant_cancel_add";
    }
            
    @RequestMapping("/restaurant_amend_add")
    public String restaurantAmendAdd(){
        return "restaurant_amend_add";
    }
            
    @RequestMapping("/restaurant_confirm_add")
    public String restaurantConfirmAdd(){
        return "restaurant_confirm_add";
    }
    
    @RequestMapping("/location_information_add")
    public String locationInformationAdd(){
        return "location_information_add";
    }    
        
    @RequestMapping("/location_newbooking_add")
    public String locationNewbookingAdd(){
        return "location_newbooking_add";
    }
            
    @RequestMapping("/location_series_add")
    public String locationSeriesAdd(){
        return "location_series_add";
    }
            
    @RequestMapping("/location_cancel_add")
    public String locationCancelAdd(){
        return "location_cancel_add";
    }
            
    @RequestMapping("/location_amend_add")
    public String locationAmendAdd(){
        return "location_amend_add";
    }
            
    @RequestMapping("/location_confirm_add")
    public String locationConfirmAdd(){
        return "location_confirm_add";
    }
    
    
}
