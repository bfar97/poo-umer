
/**
 * Escreva a descrição da classe Motorista aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.ArrayList;
public class Driver extends User {
    
    /** variaveis de instancia de todos */
    private Vehicle vehicle;
    private float gcumprimento;
    private int rating;
    private float kms;
    private boolean working;
    
    
    public Driver() {
        this.setEmail("n/a");
        this.setNome("n/a");
        this.setPword("n/a");
        this.setAdress("n/a");
        this.setDofB(0);
        this.setMofB(0);
        this.setYofB(0);
        this.setTrips(new ArrayList());
        
    }
}

