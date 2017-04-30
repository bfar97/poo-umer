
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Vehicle {
    
   // Variaveis de instancia //
   private static String matricula;
   private static Vehicletype type;
   private Ponto2D position;
   private Driver driver;

   public Vehicle() {
       matricula = "N/A";
       type = 
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
   

   

   
   public boolean getWaitlistStatus() {
       return this.waitlistStatus;
   }
   
   public void setWaitlistStatus(boolean status) {
       this.waitlistStatus = status;
   }
   
   public Vehicle clone() {
       return new Vehicle(this);
   }
   
   public boolean equals(Object x) {
       if(this == x)
            return true;
       if((x == null) || (this.getClass() != x.getClass()))
            return false;
       Vehicle k = (Vehicle) x;
       return (
   }
   
}
