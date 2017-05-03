
/**
 * Escreva a descrição da classe Utilizador aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */


import java.util.ArrayList;
public class Client extends User{

    // variaveis de instancia de um utlizador
    private Ponto2D position;


    public Client() {
        super();
        this.position = new Ponto2D();
    }
    
    public Client(String email, String nome, String password, String adress, int dofB, int mofB,
    int yofB, ArrayList<Viagem> k, double x, double y) {
        super(email, nome, password, adress, dofB, mofB, yofB, k);
        this.position = new Ponto2D(x, y);
    }
    
    public Client(Client c) {
        super(c); 
        this.position = c.getPosition();
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
    
    public boolean equals(Object x) {
        if(this == x)
            return true;
        if((x == null) || (this.getClass() != x.getClass()))
            return false;
        Client k = (Client) x;
        return((this.getNome().equals(k.getNome()) || this.getEmail().equals(k.getEmail())));
    }
    
    public Client clone() {
        return new Client(this);
    }
    
}
