
/**
 * Write a description of class Vehicletype here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//import java.util.ArrayList;

public class VehicleType extends Vehicle {

    private int seats;
    private int speedPkm;
    private int pricePkm;
    private int reliabilityFactor;
    
    /* todo
    private boolean waitlistStatus;
    private ArrayList<Client> waitL;
    */
    
    // Construtores
    public VehicleType() {
        super();
        seats = 2;
        speedPkm = 0;
        pricePkm = 0;
        reliabilityFactor = 1; 
    }
    
    public VehicleType(String matr, int x, int y, Driver sapococas,
    int seats, int speed, int price, int reliabilityFactor) {
        super(matr, x, y, sapococas);
        this.seats = seats;
        this.speedPkm = speed;
        this.pricePkm = price;
        this.reliabilityFactor = reliabilityFactor;
    }
    
    public VehicleType(VehicleType type) {
        super(type);
        this.seats = type.getSeats();
        this.speedPkm = type.getSpeed();
        this.pricePkm = type.getPrice();
        this.reliabilityFactor = type.getFactor();
    }    
    
    // Getters
    public int getSeats() {
        return seats;
    }
    
    public int getSpeed() {
        return speedPkm;
    }
    
    public int getPrice() {
        return pricePkm;
    }
    
    public int getFactor() {
        return reliabilityFactor;
    }
    
    // Setters
    public void setSeats(int ns) {
        this.seats = ns;
    }
    
    public void setSpeed(int speed) {
        this.speedPkm = speed;
    }
    
    public void setPrice(int price) {
        this.pricePkm = price;
    }
    
    public void setFactor(int factor) {
        this.reliabilityFactor = factor;
    }
    
    // Metodos Importantes
    public String toString() {
        return( super.toString() + 
                "Seats: " + this.seats + 
               "\nSpeed" + this.speedPkm + 
               "\nPrice per km: " + this.pricePkm + 
               "\nReliability Factor");
    }
}