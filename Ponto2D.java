
/**
 * Escreva a descrição da classe Ponto2D aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

/**
 * Pontos descritos como 2 coordenadas reais.
 */
import java.lang.Math;
public class Ponto2D {
    
    // Variáveis de Instância
    private double x, y;
    
    //Construtores usuais
    public Ponto2D() {
        x = 0.0;
        y = 0.0;
    }
    
    public Ponto2D(double cx, double cy) {
        x = cx;
        y = cy;
    }

    public Ponto2D(Ponto2D p) {
        x = p.getX();
        y = p.getY();
    }
    
    // Getter's
    public double getX() { return x; }
    public double getY() { return y; }
    
    // Setter's
    public void setX(double cx) {
        this.x = cx;
    }
    
    public void setY(double cy) {
        this.y = cy;
    }
    
    public void setXY(double cx, double cy) {
        this.setX(cx);
        this.setY(cy);
    }
    
    // Metodos adicionais
    
    /** Incremento de coordenadas */
    public void incCord(double dx, double dy) {
        x += dx;
        y += dy;
    }
    
    /** Decremento de coordenadas */
    public void decCord(double dx, double dy) {
        x -= dx;
        y -= dy;
    }
    
    /** soma as coordenadas do ponto parâmetro ao ponto receptor */
    public void somaPont(Ponto2D p) {
        x += p.getX();
        y += p.getY();
    }
    
    /** soma os valores parametro e devolve um novo ponto */
    public Ponto2D somaPonto(double dx, double dy) {
        return new Ponto2D(x + dx, y + dy);
    }
    
    /** calcula a distancia do ponto k - this */
    public double Dist(Ponto2D k) {
        double a = this.getX() - k.getX();
        double b = this.getY() - k.getY();
        
        return (Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0)));
    }
    
    //Metodos Importantes
    
    public boolean equals(Object x) {
        if(this == x)
            return true;
            
        if((x == null) || (this.getClass() != x.getClass()))
            return false;
            
        Ponto2D k = (Ponto2D) x;
        return (this.x == k.getX() && this.y == k.getY());
    }    
    
    public String toString() {
        return new String("( " + x + ", " + y + ")\n");
    }
    
    public Ponto2D clone() {
        return new Ponto2D(this);
    }
    
}
