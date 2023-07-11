/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busresv;

/**
 *
 * @author linux
 */
public class Bus {
   private int busNo;
   private boolean ac;
   private int capacity;
    
    //constructor
    Bus(int no, boolean ac, int cap){
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }
    
    //get and set method for capacity
    public int getCapacity(){
        return capacity;
    }
    
    public void setCapacitty(int cap){
        capacity = cap;
    }
    
    // set and get method for ac
    public boolean isAc(){
        return ac;
    }
    public void setAc(boolean val){
        ac = val;
    }
    
    //get bus no
    public int getBusNo(){
        return busNo;
    }
    
    
    //display info method
    public void displayBusInfo(){
        System.out.println("Bus no: "+busNo+" Ac: "+ac+" Total Capacity:"+capacity);
    }
   
}
