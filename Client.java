
/**
 * Escreva a descrição da classe Utilizador aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */


import java.util.ArrayList;
public class Client extends User{

    /** variaveis de instancia de um utlizador */
    private Ponto2D position;


    public Client() {
        this.position = new Ponto2D();
    }
    
    public Client(String email, String nome, String password, String adress, int dofB, int mofB,
    int yofB, ArrayList<Viagem> k, double x, double y) {
        this.setEmail(email);
        this.setNome(nome);
        this.setPword(password);
        this.setAdress(adress);
        this.setDofB(dofB);
        this.setMofB(mofB);
        this.setYofB(yofB);
        this.setTrips(k);
        this.position = new Ponto2D(x, y);
    }
    
    public Client(Client c) {
        this.setEmail(c.getEmail());
        this.setNome(c.getNome());
        this.setPword(c.getPword());
        this.setAdress(c.getAdress());
        this.setDofB(c.getDofB());
        this.setMofB(c.getMofB());
        this.setYofB(c.getYofB());
        this.position = c.position;
    }
    
    // Getter's
    
    public Ponto2D getPosition() {
        return this.position;
    }
    
    // Setter's
    
    public void setPosition(Ponto2D c) {
        this.position = c;
    }
    
    public void setPos(double cx, double cy) {
        this.position.setXY(cx, cy);
    }
    
    // Metodos Importantes
    
    public String toString() {
        return(super.toString() + "\n" + this.position.toString());
    }
    
    public Client clone() {
        return new Client(this);
    }
    
}
