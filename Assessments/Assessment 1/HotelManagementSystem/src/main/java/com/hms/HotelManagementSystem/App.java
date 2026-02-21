package com.hms.HotelManagementSystem;

/**
 * Hello world!
 *
 */
import com.hms.entities.*;

public class App 
{
	
    public static void main( String[] args )
    {
        Reception r = new Reception();
        
        // Adding Bookings
        r.addCustomer(new Booking("Sai","Standard",4));
        r.addCustomer(new Booking("Arjun","Deluxe",3));
        r.addCustomer(new Booking("Abhishek","Suite",4));
        r.addCustomer(new Booking("Karthik","Deluxe",5));
        r.addCustomer(new Booking("Abhishek","Suite",4));
        r.addCustomer(new Booking("Vignesh","Suite",5));
        r.addCustomer(new Booking("Sujith","Deluxe",4));
        r.addCustomer(new Booking("Pratham","Standard",7));
        
        // View All bookings
        r.viewAllBookings();
        
        // Update Bookings
        r.updateBooking(new Booking("Siddhartha","Standard",4),4);
        r.updateBooking(new Booking("Mohith","Deluxe",3),6);
        
        //View Booking
        r.viewBooking(9);
        
        // Delete Booking
        r.deleteBooking(5);
        
        r.viewAllBookings();
    }
}
