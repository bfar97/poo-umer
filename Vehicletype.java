
/**
 * Write a description of class Vehicletype here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicletype extends Vehicle {
   /** variaveis de instancia **/
   private int lugares;
   private String matricula;
   
   /** Construtores **/
   
   public Vehicletype() {
       lugares = 5;
       matricula = "11-BB-11";
   }
   
   public Vehicletype(int lugares, String matricula) {
       this.lugares = lugares;
       this.matricula = matricula;
   }
   
   public Vehicletype(Vehicletype car) {
       lugares = car.lugares;
       matricula = car.matricula;
   }
   
   /** getters e setters **/
   public int getLugares() {
       return this.lugares;
   }
   
   public void setLugares(int numLugares) {
       this.lugares = numLugares;
   }
   
   public String getMatricula() {
       return this.matricula;
   }
   
   public void setMatricula(String mat) {
       this.matricula = mat;
   }
}   
