
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Vehicle {
    
   // Variaveis de instancia //
   private final String matricula;
   private VehicleType type;
   private Ponto2D position;
   private Driver driver;
   
   public Vehicle() {
       matricula = "N/A";
       type = VehicleType.LIGEIROS;
       position = new Ponto2D();
       driver = new Driver();
   }
   
   public Vehicle(String matr, VehicleType type, double posX, double posY, Driver driver) {
       this.matricula = matr;
       this.type = type;
       this.position = new Ponto2D(posX, posY);
       this.driver = driver;
   }
   
   public Vehicle(Vehicle car) {
       matricula = car.getMatricula();
       type = car.getType();
       position = car.getPosition();
       driver = car.getDriver();
   }
   
   /** Getters **/
   public String getMatricula() {
       return this.matricula;
   }
   
   public VehicleType getType() {
       return this.type;
   }
   
   public Ponto2D getPosition() {
       return this.position;
   }
   
   public Driver getDriver() {
       return this.driver;
   }
   
   /** Setters */
   public void setType(VehicleType type) {
       this.type = type;
   }
   
   public void setPosition(double posX, double posY) {
       this.position = new Ponto2D(posX, posY);
   }
   
   public void setDriver(Driver driver) {
       this.driver = driver;
   }
   
   public Vehicle clone() {
       return new Vehicle(this);
   }
   
   public String toString() {
       return("Matricula: " +  this.matricula + 
              "\nTipo: " + this.type.toString() + 
              "\nPosition: " + this.position.toString() + 
              "\nDriver: " + this.driver.toString());
    }
}
