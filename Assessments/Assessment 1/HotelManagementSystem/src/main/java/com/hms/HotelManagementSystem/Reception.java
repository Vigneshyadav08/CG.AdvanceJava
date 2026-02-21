package com.hms.HotelManagementSystem;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;
import com.hms.entities.*;

public class Reception {
	static Configuration cfg = new Configuration().configure("/in/cg/config/hibernate.cfg.xml");
	static SessionFactory sf = cfg.buildSessionFactory();
	static Session s = sf.openSession();
	static Transaction t;
	
	public void addCustomer(Booking booking)
	{
		t = s.beginTransaction();
		try
		{
			s.save(booking);
			t.commit();
			System.out.println("Room booked successfully...");
		}catch(Exception e)
		{
			System.out.println("Already Booked...");
		}
	}
	
	public void viewBooking(int bookId)
	{
		t = s.beginTransaction();
		Booking booking = s.get(Booking.class,bookId);
		t.commit();
		System.out.println(booking.getBookingId()+" "+booking.getCustomerName()+" "+booking.getRoomType()+" "+booking.getDays()+" "+booking.getTotalAmount());
	}
	
	public void updateBooking(Booking booking,int bookId)
	{
		t = s.beginTransaction();
		Booking oldBooking = s.get(Booking.class,bookId);
		oldBooking.setCustomerName(booking.getCustomerName());
		oldBooking.setRoomType(booking.getRoomType());
		oldBooking.setDays(booking.getDays());
		oldBooking.setTotalAmount(booking.getTotalAmount());
		s.saveOrUpdate(oldBooking);
		t.commit();
		System.out.println("Booking has been updated...");
	}
	
	public void viewAllBookings()
	{
		t = s.beginTransaction();
		try {
			List<Booking> bookings = s.createQuery("from Booking",Booking.class).list();
			System.out.println();
			for(Booking booking:bookings)
			{
				System.out.println(booking.getBookingId()+" "+booking.getCustomerName()+" "+booking.getRoomType()+" "+booking.getDays()+" "+booking.getTotalAmount());
			}
			System.out.println();
			t.commit();
		}catch(Exception e)
		{
			t.rollback();
			System.out.println("Error occurred...");
		}
	}
	
	public void deleteBooking(int bookId)
	{
		t = s.beginTransaction();
		s.delete(s.get(Booking.class,bookId));
		t.commit();
		System.out.println("Booking has been deleted...");
	}
}
