
/**
 * Escreva a descrição da classe User aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class User {
    
    // Variaveis de instancia de todos os utilizadores
    
    private String email;
    private String nome;
    private String password;
    private String adress;
    private int dofBirth;
    private int mofBirth;
    private int yofBirth;
    
    // Construtores
    
    public User() {
        email = "n/a";
        nome = "n/a";
        password = "n/a";
        adress = "n/a";
        dofBirth = 0;
        mofBirth = 0;
        yofBirth = 0;
    }
    
    public User(String email, String nome, String password, String adress, int dofB, int mofB, int yofB) {
        this.email = email;
        this.nome = nome;
        this.password = password;
        this.adress = adress;
        this.dofBirth = dofB;
        this.mofBirth = mofB;
        this.yofBirth = yofB;
    }
    
    public User(User k) {
        email = k.getEmail();
        nome = k.getNome();
        password = k.getPword();
        adress = k.getAdress();
        dofBirth = k.getDofB();
        mofBirth = k.getMofB();
        yofBirth = k.getYofB();
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
        dofBirth = day;
    }
    
    public void setMofB(int month) {
        mofBirth = month;
    }
    
    public void setYofB(int year) {
        yofBirth = year;
    }
    
    // Metodos importantes
    
    public boolean equals(Object k) {
        if(this == k)
            return true;
        
        if((k == null) || (this.getClass() != k.getClass()))
            return false;
        
        User x = (User) k;
        return (this.email.equals(x.email) && this.email.equals(x.email) &&
                this.password.equals(x.password) && this.adress.equals(x.adress) &&
                this.dofBirth == x.dofBirth && this.mofBirth == x.dofBirth &&
                this.yofBirth == x.yofBirth);
    }
    
    public User clone(User k) {
        return new User(k);
    }
    
    public String toString() {
       return("Email: " + email + "\nNome: " + nome + "\nPassword: " + password +
              "\nAdress: " + adress + "\nDate of Birth: " + dofBirth + "/ " + mofBirth +
              "/ " + yofBirth + "\n");
    }
}
