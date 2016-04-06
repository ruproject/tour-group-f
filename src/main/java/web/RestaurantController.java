/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantController {
    
    @RequestMapping("/restaurant_information")
    public String restaurantInformation(){
        return "restaurant_information";
    }
    
    @RequestMapping("/restaurant_information_add")
    public String restaurantInformationAdd(){
        return "restaurant_information_add";
    }
    
    @RequestMapping("/restaurant_newbooking")
    public String restaurantNewbooking(){
        return "restaurant_newbooking";
    }
    
    @RequestMapping("/restaurant_newbooking_add")
    public String restaurantNewbookingAdd(){
        return "restaurant_newbooking_add";
    }
    
    @RequestMapping("/restaurant_series")
    public String restaurantSeries(){
        return "restaurant_series";
    }
    
    @RequestMapping("/restaurant_series_add")
    public String restaurantSeriesAdd(){
        return "restaurant_series_add";
    }
    
    @RequestMapping("/restaurant_cancel")
    public String restauranthotelCancel(){
        return "restaurant_cancel";
    }
    
    @RequestMapping("/restaurant_cancel_add")
    public String restaurantCancelAdd(){
        return "restaurant_cancel_add";
    }
    
    @RequestMapping("/restaurant_amend")
    public String restaurantAmend(){
        return "restaurant_amend";
    }
    
    @RequestMapping("/restaurant_amend_add")
    public String restaurantAmendAdd(){
        return "restaurant_amend_add";
    }
    
    @RequestMapping("/restaurant_confirm")
    public String restaurantConfirm(){
        return "restaurant_confirm";
    }
    
    @RequestMapping("/restaurant_confirm_add")
    public String restaurantConfirmAdd(){
        return "restaurant_confirm_add";
    }
}
