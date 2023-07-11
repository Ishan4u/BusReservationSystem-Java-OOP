package busresv;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ishan
 */
public class BusResv {

    public static void main(String[] args) {
        
        ArrayList<Bus> buses = new ArrayList<Bus>(); //bus class object lis
        ArrayList<Booking> bookings = new ArrayList<Booking>(); //booking class object lis
        
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,55));
        buses.add(new Bus(3,true,66));
        
        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);
        
        //display buses
        for(Bus b:buses){
            b.displayBusInfo();
        }
        
        while (userOpt == 1) {
            System.out.println("Enter 1 to Book");
            System.out.println("Enter 2 to Exit");
            
            userOpt = scanner.nextInt();
            if(userOpt == 1){
                Booking booking = new Booking(); //create booking object
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is Confirmed");
                }else{
                    System.out.println("Bus is full, try another bus or date...");
                }
            }
        }

    }
}
