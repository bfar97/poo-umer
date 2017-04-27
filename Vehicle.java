
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle {
    
   // Variaveis de instancia //
   private int speedPkm;
   private int pricePkm;
   private int reliabilityFactor;
   private boolean waitlistStatus;
   
   /** Contrutores **/
   
   public Vehicle() {
       speedPkm = 0;
       pricePkm = 0;
       reliabilityFactor = 100;
       waitlistStatus = true;
   }
   
   public Vehicle(int speedPkm, int pricePkm, int reliabilityFactor, boolean waitlistStatus) {
       this.speedPkm = speedPkm;
       this.pricePkm = pricePkm;
       this.reliabilityFactor = reliabilityFactor;
       this.waitlistStatus = waitlistStatus;
   }
   
   public Vehicle(Vehicle car) {
       speedPkm = car.speedPkm;
       pricePkm = car.pricePkm;
       reliabilityFactor = car.reliabilityFactor;
       waitlistStatus = car.waitlistStatus;
   }
   
   /**getters setters **/
   public int getSpeed() {
       return this.speedPkm;
   }
   
   public void setSpeed(int speed) {
       this.speedPkm = speed;
   }
   
   public int getPrice() {
       return this.pricePkm;
   }
   
   public void setPrice(int price) {
       this.pricePkm = price;
   }
   
   public int getFactor() {
       return this.reliabilityFactor;
   }
   /** enquanto não randomizamos, factor set to 100**/
   public void setFactor(int factor) {
       this.reliabilityFactor = 100;
   }
   
   public boolean getWaitlistStatus() {
       return this.waitlistStatus;
   }
   
   public void setWaitlistStatus(boolean status) {
       this.waitlistStatus = status;
   }
}
