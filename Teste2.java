
/**
 * Escreva a descrição da classe Teste2 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Teste2
{
    public static void main(String[] args) {
        Ponto2D k = new Ponto2D(2.0, 2.0);
        Ponto2D w = new Ponto2D(3.0, 3.0);
        String part = "Quinta";
        String cheg = "Gualtar";
        Viagem p = new Viagem(part, k, cheg, w);
        
        System.out.print(p.toString());
    }
}
