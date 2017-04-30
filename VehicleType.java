
/**
 * Write a description of class Vehicletype here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//import java.util.ArrayList;

public enum VehicleType {
    LIGEIROS(5,70,4,100),
    MOTOS(2,80,2,100),
    NOVELUGARES(9,60,6,100);
    
    private int seats;
    private int speedPkm;
    private int pricePkm;
    private int reliabilityFactor;
    
    /** todo
    private boolean waitlistStatus;
    private ArrayList<Client> waitL;
    **/
    
    /** Construtores **/
    VehicleType(int seats, int speed, int price, int reliabilityFactor) {
        this.seats = seats;
        this.speedPkm = speed;
        this.pricePkm = price;
        this.reliabilityFactor = reliabilityFactor;
    }
    
    public int getSeats() {
        return this.seats;
    }
    
    public int getSpeed() {
        return this.speedPkm;
    }
    
    public int getPrice() {
        return this.pricePkm;
    }
    
    public int getFactor() {
        return this.reliabilityFactor;
    }
    
    public String toString() {
        return("Seats: " + this.seats + 
               "\nSpeed" + this.speedPkm + 
               "\nPrice per km: " + this.pricePkm + 
               "\nReliability Factor");
    }
}