/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotelController {
    
    @RequestMapping("/hotel_information")
    public String hotelInformation(){
        return "hotel_information";
    }
    
    @RequestMapping("/hotel_booking")
    public String hotelBooking(){
        return "hotel_booking";
    }
    
    @RequestMapping("/hotel_information_add")
    public String hotelInformationAdd(){
        return "hotel_information_add";
    }
    
    @RequestMapping("/hotel_newbooking")
    public String hotelNewbooking(){
        return "hotel_newbooking";
    }
    
    @RequestMapping("/hotel_newbooking_add")
    public String hotelNewbookingAdd(){
        return "hotel_newbooking_add";
    }
    
    @RequestMapping("/hotel_series")
    public String hotelSeries(){
        return "hotel_series";
    }
    
    @RequestMapping("/hotel_series_add")
    public String hotelSeriesAdd(){
        return "hotel_series_add";
    }
    
    @RequestMapping("/hotel_cancel")
    public String hotelCancel(){
        return "hotel_cancel";
    }
    
    @RequestMapping("/hotel_cancel_add")
    public String hotelCancelAdd(){
        return "hotel_cancel_add";
    }
    
    @RequestMapping("/hotel_amend")
    public String hotelAmend(){
        return "hotel_amend";
    }
    
    @RequestMapping("/hotel_amend_add")
    public String hotelAmendAdd(){
        return "hotel_amend_add";
    }
    
    @RequestMapping("/hotel_confirm")
    public String hotelConfirm(){
        return "hotel_confirm";
    }
    
    @RequestMapping("/hotel_confirm_add")
    public String hotelConfirmAdd(){
        return "hotel_confirm_add";
    }
    
}
