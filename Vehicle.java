
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Vehicle {
    
   // Variaveis de instancia
   private final String matricula;
   private Ponto2D position;
   private Driver driver;
   
   // Construtores
   public Vehicle() {
       matricula = "N/A";
       position = new Ponto2D();
       driver = new Driver();
   }
   
   public Vehicle(String matr, double posX, double posY, Driver driver) {
       this.matricula = matr;
       this.position = new Ponto2D(posX, posY);
       this.driver = driver;
   }
   
   public Vehicle(Vehicle car) {
       matricula = car.getMatricula();
       position = car.getPosition();
       driver = car.getDriver();
   }
   
   // Getters
   public String getMatricula() {
       return this.matricula;
   }
     
   public Ponto2D getPosition() {
       return this.position;
   }
   
   public Driver getDriver() {
       return this.driver;
   }
   
   // Setters (Matricula nao tem porque e final) 
   public void setPosition(double posX, double posY) {
       this.position = new Ponto2D(posX, posY);
   }
   
   public void setDriver(Driver driver) {
       this.driver = driver;
   }
   
   //Metodos Importantes
   
   public boolean equals(Object k) {
       if(this == k)
          return true;
       if((k == null) || (this.getClass() != k.getClass()))
          return false;
       Vehicle x = (Vehicle) k;
       return(this.matricula.equals(x.getMatricula()));
   }
   
   public Vehicle clone() {
       return new Vehicle(this);
   }
   
   public String toString() {
       return("Matricula: " +  this.matricula +  
              "\nPosition: " + this.position.toString() + 
              "\nDriver: " + this.driver.toString());
   }
}
