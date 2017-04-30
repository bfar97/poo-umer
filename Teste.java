
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
    
        User w = new User(email, nome, password, adress, dB, mB, yB, k);
        
        System.out.print(w.toString());
    }    
}
