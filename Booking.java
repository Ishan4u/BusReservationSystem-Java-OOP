/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busresv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ishan
 */
public class Booking {
    String passangerName;
    int busNo;
    Date date;
    
    Booking(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Passanger Name: ");
        passangerName= scanner.next();
        
        System.out.println("Enter bus No: ");
        busNo = scanner.nextInt();
        
        System.out.println("Enter date dd-MM-yyyy");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        // assign date
        try {
            date = dateFormat.parse(dateInput); 
        } catch (ParseException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
        //
        int capacity =0;
        for(Bus bus:buses){
            if(bus.getBusNo()== busNo){
                capacity = bus.getCapacity();
            }
        }
        
        int booked=0;
        for(Booking b:bookings){
            if(b.busNo == busNo && b.date.equals(date)){
                booked++;
            }
        }
        
        return booked<capacity?true:false;
        
    }
}
