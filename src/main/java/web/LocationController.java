/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {
    
    @RequestMapping("/location_information")
    public String locationInformation(){
        return "location_information";
    }
    
    @RequestMapping("/location_information_add")
    public String locationInformationAdd(){
        return "location_information_add";
    }
    
    @RequestMapping("/location_newbooking")
    public String locationNewbooking(){
        return "location_newbooking";
    }
    
    @RequestMapping("/location_newbooking_add")
    public String locationNewbookingAdd(){
        return "location_newbooking_add";
    }
    
    @RequestMapping("/location_series")
    public String locationSeries(){
        return "location_series";
    }
    
    @RequestMapping("/location_series_add")
    public String locationSeriesAdd(){
        return "location_series_add";
    }
    
    @RequestMapping("/location_cancel")
    public String locationCancel(){
        return "location_cancel";
    }
    
    @RequestMapping("/location_cancel_add")
    public String locationCancelAdd(){
        return "location_cancel_add";
    }
    
    @RequestMapping("/location_amend")
    public String locationAmend(){
        return "location_amend";
    }
    
    @RequestMapping("/location_amend_add")
    public String locationAmendAdd(){
        return "location_amend_add";
    }
    
    @RequestMapping("/location_confirm")
    public String locationConfirm(){
        return "location_confirm";
    }
    
    @RequestMapping("/location_confirm_add")
    public String locationConfirmAdd(){
        return "location_confirm_add";
    }
}
