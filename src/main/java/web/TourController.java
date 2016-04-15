/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TourController {
    
    @RequestMapping("/tour_information")
    public String tourInformation(){
        return "tour_information";
    }
    
    @RequestMapping("/tour_information_add")
    public String tourInformationAdd(){
        return "tour_information_add";
    }
    
    @RequestMapping("/tour_hotel_booking")
    public String tourHotelBooking(){
        return "tour_hotel_booking";
    }
    
    @RequestMapping("/tour_hotel_booking_add")
    public String tourHotelBookingAdd(){
        return "tour_hotel_booking_add";
    }
    
    @RequestMapping("/tour_job")
    public String tourJob(){
        return "tour_job";
    }
    @RequestMapping("/tour_job_add")
    public String tourJobAdd(){
        return "tour_job_add";
    }
}
