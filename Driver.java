
/**
 * Escreva a descrição da classe Motorista aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.ArrayList;
public class Driver extends User {
    
    // variaveis de instancia
    private Vehicle vehicle;
    private float gcumprimento;
    private int rating;
    private double kms;
    private boolean working;
    
    // Construtores
    public Driver() {
        this.vehicle = new Vehicle();
        this.gcumprimento = (float) 0.0;
        this.rating = 0;
        this.kms = 0.0;
        this.working = false;
    }
    
    public Driver(String email, String nome, String password, String adress, int dofB, int mofB,
    int yofB, ArrayList<Viagem> k, Vehicle car, float gcump, int rating, double kms, boolean work) {
        this.setEmail(email);
        this.setNome(nome);
        this.setPword(password);
        this.setAdress(adress);
        this.setDofB(dofB);
        this.setMofB(mofB);
        this.setYofB(yofB);
        this.setTrips(k);
        this.vehicle = car;
        this.gcumprimento = gcump;
        this.rating = rating;
        this.kms = kms;
        this.working = work;
    }
    
    public Driver(Driver c) {
        this.setEmail(c.getEmail());
        this.setNome(c.getNome());
        this.setPword(c.getPword());
        this.setAdress(c.getAdress());
        this.setDofB(c.getDofB());
        this.setMofB(c.getMofB());
        this.setYofB(c.getYofB());
        this.setTrips(c.getTrips());
        this.vehicle = c.getVehicle();
        this.gcumprimento = c.getGcump();
        this.rating = c.getRating();
        this.kms = c.getKms();
        this.working = c.getWork();
    } 
    
    // Getter's
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public float getGcump() {
        return gcumprimento;
    }
    
    public int getRating() {
        return rating;
    }
    
    public double getKms() {
        return kms;
    }
    
    public boolean getWork() {
        return working;
    }
    
    // Setter's
    
    public void setVehicle(Vehicle car) {
        this.vehicle = car;
    }
    
    public void setGcump(float gc) {
        this.gcumprimento = gc;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public void setKms(double kms) {
        this.kms = kms;
    }
    
    public void setWork(boolean wornot) {
        this.working = wornot;
    }
    
    // Metodos Importantes
    public Driver clone() {
        return new Driver(this);
    }
        
    public String toString() {
        return(super.toString() + "\nVeiculo: " + this.vehicle.toString() +
        "\nGrau de Cumprimento: " + this.gcumprimento + "\nRating: " + this.rating +
        "\n Quilometros: " + this.kms + "\nA Trabalhar: " + this.working);   
    }
    
}

