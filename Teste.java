
/**
 * Escreva a descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.ArrayList;
public class Teste
{
    public static void main(String[] args) {
        String nome = "Cesar Silva";
        String adress = "Quinta Azurem";
        String password = "Testeteste";
        String email =  "cesar_silva_1995@hotmail.com";
        int dB = 7;
        int mB = 11;
        int yB = 95;
        ArrayList<Viagem> k = new ArrayList<Viagem>();
        
        Ponto2D k1 = new Ponto2D(2.0, 2.0);
        Ponto2D w = new Ponto2D(3.0, 3.0);
        String part = "Quinta";
        String cheg = "Gualtar";
        Viagem p = new Viagem(part, k1, cheg, w);
              
        Client w1 = new Client(email, nome, password, adress, dB, mB, yB, k, 2.0, 2.0);
        
        ArrayList<Viagem> trip = new ArrayList<Viagem>();
        trip.add(p);
        
        w1.setTrips(trip);
        
        System.out.print(w1.toString());
    }    
}
