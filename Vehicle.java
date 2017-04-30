
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Vehicle {
    
   // Variaveis de instancia //
   private static String matricula;
   private VehicleType type;
   private Ponto2D position;
   private Driver driver;
   
   public Vehicle(String matr, VehicleType type, double posX, double posY, Driver driver) {
       this.matricula = matr;
       this.type = type;
       this.position = new Ponto2D(posX, posY);
       this.driver = driver;
   }
   
   public Vehicle(Vehicle car) {
       matricula = car.matricula;
       type = car.type;
       position = car.position;
       driver = car.driver;
   }
}
