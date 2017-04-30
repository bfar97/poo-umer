
/**
 * Write a description of class Vehicletype here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public enum VehicleType {
    LIGEIROS(5,70,4,100),
    MOTOS(2,80,2,100),
    NOVELUGARES(9,60,6,100);
    
    private int lugares;
    private int speedPkm;
    private int pricePkm;
    private int reliabilityFactor;
    private boolean waitlistStatus;
    private ArrayList<Client> waitL;
    
    /** Construtores **/
    VehicleType(int lugares, int speed, int price, int reliabilityFactor) {
        this.lugares = lugares;
        this.speedPkm = speed;
        this.pricePkm = price;
        this.reliabilityFactor = reliabilityFactor;
    }
    
}
/**
public class Vehicletype {
  
   private static int lugares;
   private int speedPkm;
   private int pricePkm;
   private int reliabilityFactor;
   
   private boolean waitlistStatus;
   private ArrayList<Client> waitL;


   public int getSpeed() {
       return this.speedPkm;
   }
   
   public void setSpeed(int speed) {
       this.speedPkm = speed;
   }
   
   public int getLugares() {
       return this.lugares;
   }
   
   public int getPrice() {
       return this.pricePkm;
   }
   
   public void setPrice(int price) {
       this.pricePkm = price;
   }
   
   public void setFactor(int factor) {
       this.reliabilityFactor = 100;
   }
   
   public int getFactor() {
       return this.reliabilityFactor;
   }
  
}   
**/