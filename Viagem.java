
/**
 * Escreva a descrição da classe Viagens aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Viagem {
    
    // Variaveis de instancia
    
    private String lPartida;
    private Ponto2D cPartida;
    private String lChegada;
    private Ponto2D cChegada;

    //Construtores
    
    public Viagem() {
        lPartida = "n/a";
        cPartida = new Ponto2D();
        lChegada = "n/a";
        cChegada = new Ponto2D();
    }
    
    public Viagem(String lPart, Ponto2D cPart, String lCheg, Ponto2D cCheg) {
        this.lPartida = lPart;
        this.cPartida = cPart;
        this.lChegada = lCheg;
        this.cChegada = cCheg;
    }
    
    public Viagem(Viagem k) {
        this.lPartida = k.getlPart();
        this.cPartida = k.getcPart();
        this.lChegada = k.getlCheg();
        this.cChegada = k.getcCheg();
    }
    
    // Getter's
    
    public String getlPart() {
        return lPartida;
    }
    
    public Ponto2D getcPart() {
        return cPartida;
    }
    
    public String getlCheg() {
        return lChegada;
    }
    
    public Ponto2D getcCheg() {
        return cChegada;
    }
    
    // Setter's
    
    public void setlPart(String lPart) {
        this.lPartida = lPart;
    }
    
    public void setcPart(double cx, double cy) {
        this.cPartida.setXY(cx, cy);
    }
    
    public void setlCheg(String lCheg) {
        this.lChegada = lCheg;
    }
    
    public void setcCheg(double cx, double cy) {
        this.cChegada.setXY(cx, cy);
    }
    
    // Metodos Importantes
    
    public boolean equals(Object x) {
        if(this == x)
            return true;
            
        if((x == null) || (this.getClass() != x.getClass()))
            return false;
            
        Viagem k = (Viagem) x;
        return (this.cPartida.equals(k.cPartida) && this.cChegada.equals(k.cChegada));
    } 
        
    public String toString() {
        return("Local de Partida: " + this.lPartida.toString() + "\nCoordenadas: "
               + this.cPartida.toString() + "Local de Chegada: " + this.lChegada.toString() +
               "\nCoordenadas: " + this.cChegada.toString());
    }
    
    public Viagem clone() {
        return new Viagem(this);
    }
    
}
