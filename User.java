
/**
 * Escreva a descrição da classe User aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.ArrayList;
public class User {
    
    // Variaveis de instancia de todos os utilizadores
    
    private String email;
    private String nome;
    private String password;
    private String adress;
    private int dofBirth;
    private int mofBirth;
    private int yofBirth;
    private ArrayList<Viagem> trips;
    
    // Construtores
    
    public User() {
        this.email = "n/a";
        this.nome = "n/a";
        this.password = "n/a";
        this.adress = "n/a";
        this.dofBirth = 0;
        this.mofBirth = 0;
        this.yofBirth = 0;
        this.trips = new ArrayList();
    }
    
    public User(String email, String nome, String password, String adress, int dofB, int mofB, int yofB, ArrayList<Viagem> k) {
        this.email = email;
        this.nome = nome;
        this.password = password;
        this.adress = adress;
        this.dofBirth = dofB;
        this.mofBirth = mofB;
        this.yofBirth = yofB;
        this.trips = k;
    }
    
    public User(User k) {
        this.email = k.getEmail();
        this.nome = k.getNome();
        this.password = k.getPword();
        this.adress = k.getAdress();
        this.dofBirth = k.getDofB();
        this.mofBirth = k.getMofB();
        this.yofBirth = k.getYofB();
        this.trips = k.getTrips();
    }
    
    // Getter's
    
    public String getEmail() {
        return email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getPword() {
        return password;
    }
    
    public String getAdress() {
        return adress;
    }
    
    public int getDofB() {
        return dofBirth;
    }
    
    public int getMofB() {
        return mofBirth;
    }
    
    public int getYofB() {
        return yofBirth;
    }
    
    public ArrayList<Viagem> getTrips() {
        return trips;
    }
    
    // Setter's
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPword(String pw) {
        this.password = pw;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public void setDofB(int day) {
        this.dofBirth = day;
    }
    
    public void setMofB(int month) {
        this.mofBirth = month;
    }
    
    public void setYofB(int year) {
        this.yofBirth = year;
    }
    
    public void setTrips(ArrayList<Viagem> k) {
        this.trips = k;
    }
    
    // Metodos importantes
    
    public boolean equals(Object k) {
        if(this == k)
            return true;
        
        if((k == null) || (this.getClass() != k.getClass()))
            return false;
        
        User x = (User) k;
        return ((this.email.equals(x.email)) || (this.nome.equals(x.nome)));
    }
    
    public User clone() {
        return new User(this);
    }
    
    public String toString() {
       return("Email: " + this.email + "\nNome: " + this.nome + "\nPassword: " + this.password +
              "\nAdress: " + this.adress + "\nDate of Birth: " + this.dofBirth + "/ " + this.mofBirth +
              "/ " + this.yofBirth + "\nViagens: " + this.trips.toString());
    }
    
}
