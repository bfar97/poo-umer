
/**
 * Escreva a descrição da classe Motorista aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.ArrayList;
public class Driver extends User {
    
    // variaveis de instancia
    private float gcumprimento;
    private int rating;
    private double kms;
    private boolean working;
    
    // Construtores
    public Driver() {
        super();
        gcumprimento = (float) 0.0;
        rating = 0;
        kms = 0.0;
        working = false;
    }
    
    public Driver(String email, String nome, String password, String adress, int dofB, 
    int mofB, int yofB, ArrayList<Viagem> k, float gcump, int rating, double kms,
    boolean work) {
        super(email, nome, password, adress, dofB, mofB, yofB, k);
        this.gcumprimento = gcump;
        this.rating = rating;
        this.kms = kms;
        this.working = work;
    }
    
    public Driver(Driver c) {
        super(c);
        this.gcumprimento = c.getGcump();
        this.rating = c.getRating();
        this.kms = c.getKms();
        this.working = c.getWork();
    } 
    
    // Getter's
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
        return(super.toString() + "\nGrau de Cumprimento: " + this.gcumprimento + 
        "\nRating: " + this.rating + "\n Quilometros: " + this.kms + 
        "\nA Trabalhar: " + this.working);   
    }
    
}

